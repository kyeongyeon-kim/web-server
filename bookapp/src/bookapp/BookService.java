package bookapp;

import java.util.List;

public interface BookService {
	Book create(Book book);
	List<Book> read();
	Book update(Book book);
	Book delete(int no);
}
