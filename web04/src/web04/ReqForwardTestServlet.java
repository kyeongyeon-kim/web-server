package web04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqForwardTestServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("사용자의 요청 처리 제어");
		
		req.setAttribute("first", "first");
		req.getRequestDispatcher("/WEB-INF/viewattr.jsp").forward(req, resp);
		
	}
}
