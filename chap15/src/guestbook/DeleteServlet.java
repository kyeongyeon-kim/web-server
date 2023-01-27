package guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import guestbook.service.DeleteMessageService;
import guestbook.service.ServiceException;

@WebServlet("/guestbook/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(false);
		int messageId = Integer.parseInt(req.getParameter("messageId"));
		String memberid = (String) session.getAttribute("login");
		
		String message = "";
		try {
			DeleteMessageService deleteService = DeleteMessageService.getInstance();
			deleteService.deleteMessage(messageId, memberid);
			
			message = "메시지를 삭제하였습니다.";
		} catch (ServiceException ex) {
			message = ex.getMessage();
		}
		
		req.setAttribute("message", message);
		req.getRequestDispatcher("/WEB-INF/deleteMessage.jsp").forward(req, resp);
	}
	
}
