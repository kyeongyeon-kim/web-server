package guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import guestbook.model.Message;
import guestbook.service.DeleteMessageService;
import guestbook.service.MessageNotFoundException;
import guestbook.service.ServiceException;
import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;

public class JoinDao {
private static JoinDao instance = new JoinDao();
	
	public static JoinDao getInstance() {
		return instance;
	}

	public int insert(Connection conn, String memberID, String password, String name, String email)
			throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("INSERT INTO member VALUES (?, ?, ?, ?)");
			pstmt.setString(1, memberID);
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			return pstmt.executeUpdate();
			
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
}
