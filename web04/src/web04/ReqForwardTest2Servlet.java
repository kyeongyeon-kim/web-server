package web04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 작성하기
public class ReqForwardTest2Servlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("random", Math.random());
		req.setAttribute("myname", "Kim");
		req.setAttribute("bool", true);
		req.getRequestDispatcher("/WEB-INF/viewattr2.jsp").forward(req, resp);
		super.service(req, resp);
	}
	
}
