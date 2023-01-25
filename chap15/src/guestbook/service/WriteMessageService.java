package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.MessageDao;
import guestbook.model.Message;
import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;

public class WriteMessageService {
	private static WriteMessageService instance = new WriteMessageService();
	
	public static WriteMessageService getInstatnce() {
		return instance;
	}
	
	private WriteMessageService() {
	}
	
	public void write(Message message) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MessageDao messageDao = MessageDao.getInstatnce();
			messageDao.insert(conn, message);
		} catch (SQLException e	) {
			throw new ServiceException("메시지 등록 실패" + e.getMessage(), e);
		} finally {
			JdbcUtil.close(conn);
		}
	}
}
