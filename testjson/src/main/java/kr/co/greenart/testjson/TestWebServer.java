package kr.co.greenart.testjson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/api/book")
public class TestWebServer extends HttpServlet {
	
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain");

		PrintWriter out = resp.getWriter();
		out.println("DELETE");
		out.flush();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain");
		String method = req.getParameter("request");
		if (method.equals("POST")) {
			doPost(req, resp);
		} else if (method.equals("PUT")) {
			doPut(req, resp);
		} else if (method.equals("DELETE")) {
			doDelete(req, resp);
		} else {
			PrintWriter out = resp.getWriter();
			out.println("GET");
			out.flush();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain");

		PrintWriter out = resp.getWriter();
		out.println("POST");
		out.flush();
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-Type", "text/plain");

		PrintWriter out = resp.getWriter();
		out.println("PUT");
		out.flush();
	}
}
