package web04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> list = new ArrayList<>(Arrays.asList("문자열1", "문자열2", "문자열3", "문자열4"));
		
		req.setAttribute("list", list);
		req.getRequestDispatcher("/WEB-INF/veiwlist.jsp").forward(req, resp);
		
	}
}
