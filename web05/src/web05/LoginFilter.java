package web05;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

@WebFilter("/guestbook/*")
public class LoginFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터를 통해 동일한 작업을 before 수행할 수 있습니다.");
		
		chain.doFilter(request, response);
		
		System.out.println("필터를 통해 동일한 작업을 after 수행할 수 있습니다.");
	}
}
