package member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcutil.ConnectionProvider;

public class MemberDao {
	public int countMember(String memberid, String password) {
		String sql = "SELECT COUNT(*) FROM member WHERE memberid = ? AND password = ?";
		
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, memberid);
			stmt.setString(2, password);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					int count = rs.getInt(1);
					return count;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("DB 작업중 SQL 예외 발생", e);
		}
		return 0;
	}
}
