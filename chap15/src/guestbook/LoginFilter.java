package guestbook;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/guestbook/*")
public class LoginFilter extends HttpServlet implements Filter {
	
	private boolean logincheck(HttpSession session) {
		if (session == null) {
			return false;
		}
		
		return session.getAttribute("login") != null;
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		HttpSession session = req.getSession(false);
		if (!logincheck(session)) {
			resp.sendRedirect("../login.jsp");
			return;
		}
		
		chain.doFilter(request, response);
	}
}
