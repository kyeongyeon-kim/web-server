package web04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	// 사용자의 요청을 처리할 수 있는 클래스 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("-- 사용자의 요청 --");
		
		PrintWriter pw = resp.getWriter();
		pw.println("Hello World!");
		pw.flush();
	}
}
