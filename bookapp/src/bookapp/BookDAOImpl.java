package bookapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookapp.dbutil.ConnectionProvider;

public class BookDAOImpl implements BookDAO {
	
	
	@Override
	public int insert(Connection conn, Book book) {
		String sql = "INSERT INTO book (title, price) VALUES (?, ?)";
		try (PreparedStatement stmt = conn.prepareStatement
				(sql, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, book.getTitle());
			stmt.setInt(2, book.getPrice());

			int result = stmt.executeUpdate();
			if (result == 1) {
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						return rs.getInt(1);
					}
				}
			} else {
				throw new RuntimeException("행이 생성되지 않았습니다.");
			}
		} catch (SQLException e) {
			throw new RuntimeException("추가 작업 중 예외 발생", e);
		}
		return 0;
	}

	@Override
	public List<Book> select(Connection conn) {
		String sql = "SELECT * FROM book";
		List<Book> list = new ArrayList<>();
		try (PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				list.add(resultMapping(rs));
			}

		} catch (SQLException e) {
			throw new RuntimeException("추가 작업 중 예외 발생", e);
		}
		return list;
	}

	private Book resultMapping(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setNo(rs.getInt(1));
		book.setTitle(rs.getString(2));
		book.setPrice(rs.getInt(3));
		return book;
	}

	@Override
	public Book selectByNo(Connection conn, int no) {
		String sql = "SELECT * FROM book WHERE no = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return resultMapping(rs);
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException("추가 작업 중 예외 발생", e);
		}
		return null;
	}

	@Override
	public int update(Connection conn, Book book) {
		String sql = "UPDATE book SET title = ?, price = ? WHERE no = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, book.getTitle());
			stmt.setInt(2, book.getPrice());
			stmt.setInt(3, book.getNo());

			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("추가 작업 중 예외 발생", e);
		}
	}

	@Override
	public int delete(Connection conn, int no) {
		String sql = "DELETE FROM book WHERE no = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);

			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("추가 작업 중 예외 발생", e);
		}
	}
}
