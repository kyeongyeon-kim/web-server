package web06;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileSaveToMySQL implements IFileSave {

	@Override
	public void save(String filename, InputStream is) throws IOException {
		String sql = "INSERT INTO image (filename, image) VALUES (?, ?)";
		
		try (Connection conn = MyContextListener.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, filename);
			stmt.setBlob(2, is);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
