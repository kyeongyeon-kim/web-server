package web06;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servertime")
public class ServerTimeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// text/plain 그냥 글자다 문자열이다.
		resp.setHeader("Content-Type", "application/json");
		
		LocalTime now = LocalTime.now();
		
		StringBuilder sb = new StringBuilder();
		sb.append("{")
			.append("\"hour\":").append(now.getHour()).append(",")
			.append("\"minute\":").append(now.getMinute()).append(",")
			.append("\"second\":").append(now.getSecond())
			.append("}");
			
		
		PrintWriter out = resp.getWriter();
		out.println(sb.toString());
		out.flush();
	}
}
