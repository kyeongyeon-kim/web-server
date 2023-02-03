package bookapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bookapp.dbutil.ConnectionProvider;

public class BookserviceImpl implements BookService {
	private BookDAO dao;

	public BookserviceImpl(BookDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Book create(Book book) {
		Connection conn = null;
		try  {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			int key = dao.insert(conn, book);
			book.setNo(key);
			conn.commit();
		} catch (RuntimeException | SQLException e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return book;
	}

	@Override
	public List<Book> read() {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			return dao.select(conn);
		} catch (RuntimeException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public Book update(Book book) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			dao.update(conn, book);
			conn.commit();
			return book;
		} catch (RuntimeException | SQLException e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public Book delete(int no) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			Book book = dao.selectByNo(conn, no);
			if (book != null) {
				dao.delete(conn, no);
			}
			conn.commit();
			
			return book;
		} catch (RuntimeException | SQLException e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
