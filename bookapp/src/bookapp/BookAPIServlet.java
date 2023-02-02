package bookapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/book")
public class BookAPIServlet extends HttpServlet {

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setHeader("Content-Type", "text/plain; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("DELETE");
		pw.flush();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("GET");
		pw.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setHeader("Content-Type", "text/plain; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("POST");
		pw.flush();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setHeader("Content-Type", "text/plain; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("PUT");
		pw.flush();
	}
	
}
