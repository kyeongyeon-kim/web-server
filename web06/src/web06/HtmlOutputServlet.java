package web06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HtmlOutputServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Content-Type", "text/html; charset=utf-8");
		
		//jsp 의 구동 순서 : jsp의 정적인 흐름들을 클래스로 변환하여 클래스에서 동적인 흐름을 거친 후 정적인 흐름으로 바꿔 header의 요청에 맞게 브라우저로 응답하게 된다.
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE>");
		out.println("<html>");
		out.println("<head lang='ko'>");
		out.println("<body>");
		out.println("<h1>hello</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.flush();
	}
}
