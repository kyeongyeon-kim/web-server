package web06;

import java.sql.Connection;
import java.sql.SQLException;

import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;


public class UploadService {
	
	public void write(FileInfo file) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
		} catch (SQLException e	) {
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
