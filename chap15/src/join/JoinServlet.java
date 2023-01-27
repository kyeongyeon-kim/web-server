package join;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import guestbook.service.DeleteMessageService;
import guestbook.service.JoinService;
import guestbook.service.ServiceException;
import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;

@WebServlet("/insert")
public class JoinServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String memberID = req.getParameter("memberID");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		System.out.println(memberID);
		System.out.println(password);
		System.out.println(name);
		System.out.println(email);
		String message = "";
		try {
			JoinService joinService = JoinService.getInstatnce();
			int result = joinService.join(memberID, password, name, email);
			
			if (result == 0) {
				message = "회원가입에 실패하였습니다.";
			} else {
				message = "MEMBER 테이블에 새로운 레코드를 삽입했습니다";
			}
		} catch (ServiceException ex) {
			message = ex.getMessage();
		}
		
		req.setAttribute("message", message);
		req.getRequestDispatcher("/WEB-INF/deleteMessage.jsp").forward(req, resp);
	}
	
}
