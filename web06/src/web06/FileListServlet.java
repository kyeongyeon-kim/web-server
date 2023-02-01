package web06;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file/list")
public class FileListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query = "SELECT id, filename FROM image";
		Map<Integer, String> files = new HashMap<>();
		try (Connection conn = MyContextListener.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query);
				ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String filename = rs.getString("filename");
				files.put(id, filename);
			}
			req.setAttribute("files", files);
			req.getRequestDispatcher("/WEB-INF/filelist.jsp").forward(req, resp);
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
