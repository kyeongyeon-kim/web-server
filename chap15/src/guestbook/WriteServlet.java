package guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import guestbook.model.Message;
import guestbook.service.WriteMessageService;

@WebServlet("/guestbook/write")
public class WriteServlet extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		Message message = new Message();
		String m = req.getParameter("message");
		message.setMessage(m);
		String memberid = (String) session.getAttribute("login");
		message.setMemberid(memberid);
		
		WriteMessageService writeService = WriteMessageService.getInstatnce();
		writeService.write(message);
		
		req.getRequestDispatcher("/WEB-INF/writeMessage.jsp").forward(req, resp);
	}
}
