package bookapp;

import java.sql.Connection;
import java.util.List;

public interface BookDAO {
	int insert(Connection conn, Book book);
	List<Book> select(Connection conn);
	Book selectByNo(Connection conn, int no);
	int update(Connection conn, Book book);
	int delete(Connection conn, int no);
}
