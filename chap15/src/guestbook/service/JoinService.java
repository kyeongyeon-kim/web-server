package guestbook.service;

import java.sql.Connection;
import java.sql.SQLException;

import guestbook.dao.JoinDao;
import jdbcutil.ConnectionProvider;
import jdbcutil.JdbcUtil;

public class JoinService {
	private static JoinService instance = new JoinService();
	public static JoinService getInstatnce() {
		return instance;
	}
	
	private JoinService() {}
	
	public int join(String memberID, String password, String name, String email)  {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			JoinDao joinDao = JoinDao.getInstance();
			int result = joinDao.insert(conn, memberID, password, name, email);
			
			if(result == 0) {
				throw new MessageNotFoundException("회원가입 실패");
			}
			return result;
		} catch (ServiceException ex) {
			JdbcUtil.rollback(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcUtil.rollback(conn);
		}
		return 0;
	}
}
