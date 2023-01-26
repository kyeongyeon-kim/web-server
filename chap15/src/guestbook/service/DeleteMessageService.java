package guestbook.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;

public class DeleteMessageService {
	// 외부에서는 생성할 수 없는 객체
	// 정적인 변수로서 미리 만들어진 객체가 생성되어있음
	// 싱글턴 패턴
	private static DeleteMessageService instance = new DeleteMessageService();
	
	public static DeleteMessageService getInstance() {
		return instance;
	}
	
	private DeleteMessageService() {}
	
	public void deleteMessage(int messageId, String memberId, String password) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			MessageDao messageDao = MessageDao.getInstatnce();
			Message message = messageDao.select(conn, messageId);
			if(message == null) {
				throw new MessageNotFoundException("메시지 없음");
			}
			if (!matchPassword(conn, memberId, password)) {
				throw new InvalidPasswordException("bad password");
			}
			messageDao.delete(conn, messageId);
			conn.commit();
		} catch (SQLException ex) {
			JdbcUtil.rollback(conn);
			throw new ServiceException("삭제 실패" + ex.getMessage(), ex);
		} catch (MessageNotFoundException | InvalidPasswordException ex) {
			JdbcUtil.rollback(conn);
			throw ex;
		} finally {
			JdbcUtil.close(conn);
		}
		
	}
	
	private boolean matchPassword(Connection conn, String memberId, String password) throws SQLException {
		PreparedStatement pstmt = null;
		String pwd = null;
		try {
			pstmt = conn.prepareStatement(
					"SELECT `password` FROM `member` WHERE memberid = ?");
			pstmt.setString(1, memberId);
			try (ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					pwd = rs.getString(1);
				}
			}
			if (pwd.equals(password)) {
				return true;
			} else {
				return false;
			}
		} finally {
			JdbcUtil.close(pstmt);
		}
	}
}
