package guestbook;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import guestbook.service.GetMessageListService;
import guestbook.service.MessageListView;

@WebServlet("/guestbook/list")
public class GuestBookServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pageNumberStr = req.getParameter("page");
		int pageNumber = 1;
		if (pageNumberStr != null) {
			pageNumber = Integer.parseInt(pageNumberStr);
		}
		
		GetMessageListService messageListService = GetMessageListService.getInstance();
		MessageListView viewData = messageListService.getMessageList(pageNumber);
		
		req.setAttribute("viewData", viewData);
		req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);
	}
}





