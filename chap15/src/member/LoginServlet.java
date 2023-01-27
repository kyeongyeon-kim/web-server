package member;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String memberid = req.getParameter("memberid");
		String password = req.getParameter("password");
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		boolean result = service.login(memberid, password);
		if (result) {
			HttpSession session = req.getSession(true);
			session.setAttribute("login", memberid);
			req.getRequestDispatcher("/WEB-INF/loginresult.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("./login.jsp?result=fail");
		}
	}
}






