package bookapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

// * == 하위경로도 모두 맵핑하겠다는 의미
@WebServlet({ "/api/book", "/api/book/*" })
public class BookAPIServlet extends HttpServlet {
	private BookService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		service = new BookserviceImpl(new BookDAOImpl());
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pathInfo = req.getPathInfo();
		String pathNum = pathInfo.replaceFirst("/", "").trim();

		Book book = service.delete(Integer.valueOf(pathNum));

		ObjectMapper mapper = new ObjectMapper();
		String json;
		if (book == null) {
			resp.setStatus(404);
			json = "{\"result\":\"not found\"}";
		} else {
			json = mapper.writeValueAsString(book);
		}

		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Book> list = service.read();
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);

		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String json;
		String body = readBody(req);
		try {
		Book book = jsonToBook(body);
		book = service.create(book);
		
		ObjectMapper mapper = new ObjectMapper();
		json = mapper.writeValueAsString(book);
		} catch (JsonProcessingException e) {
			resp.setStatus(400);
			json = "{\"result\":\"유효하지 않은 json 포맷\"}";
		}
		
		PrintWriter pw = resp.getWriter();
		pw.println(json);
		pw.flush();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	private Book jsonToBook(String json) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, Book.class);
	}

	private String readBody(HttpServletRequest req) throws IOException {
		BufferedReader reader = req.getReader();
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}

}
