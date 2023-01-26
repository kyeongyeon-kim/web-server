package member;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	// 사용자의 요청 방식에 따라 우리가 재정의 해 사용할 수 있는 메소드가 여러가지 있다.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String memberid = req.getParameter("memberid");
		String password = req.getParameter("password");
		
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		boolean result = service.login(memberid, password);
		
		if(result) {
			HttpSession session = req.getSession(true);
			session.setAttribute("memberid", memberid);
			session.setAttribute("password", password);
			req.getRequestDispatcher("/WEB-INF/loginresult.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("./login.jsp?result=fail");
		}
	}
}
