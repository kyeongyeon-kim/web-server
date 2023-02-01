package web06;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/file/download")
public class FileDownloadServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(FileDownloadServlet.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		logger.info("사용자 요청 파일 id : " + req.getParameter("id"));
		Integer id = Integer.valueOf(req.getParameter("id"));
		String query = "SELECT * FROM image WHERE id = ?";
		try(Connection conn = MyContextListener.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setInt(1, id);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					String filename = rs.getString("filename");
					Blob image = rs.getBlob("image");
					// (응답 조작을 위한/ 바디부분 내용에대한 힌트를 제공해주는)헤더 부분
					resp.setHeader("Content-Type", "application/octet-stream");
					// http 헤더도 주소창과 마찬가지로 인코딩을 거쳐야한다.
					resp.setHeader("Content-disposition", "attachment; filename=" + URLEncoder.encode(filename, "UTF-8"));
					
					//바디 부분 (파일내용이 들어가게 됨(이진데이터형태로))
					ServletOutputStream out = resp.getOutputStream();
					out.write(image.getBytes(1, (int) image.length()));
					out.flush();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
