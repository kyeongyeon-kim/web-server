package bookapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import bookapp.dbutil.ConnectionProvider;

public class TestBookService {
	private static BookService service;
	
	@BeforeClass
	public static void setup() {
		service = new BookserviceImpl(new BookDAOImpl());
	}
	
	@Test
	public void create() {
		Book book = new Book();
		book.setTitle("서비스 객체 테스트");
		book.setPrice(30000);
		
		Book result = service.create(book);
		System.out.println(result.getNo());
		assertNotNull(result);
	}
	
	@Test
	public void read() {
		List<Book> list = service.read();
		assertNotNull(list);
	}
	
	@Test
	public void update() {
		Book book = new Book(5, "테스트", 5000);
		
		Book result = service.update(book);
		assertEquals(book, result);
	}
	
	@Test
	public void delete() throws SQLException {
		BookDAO dao = new BookDAOImpl();
		Book b = dao.selectByNo(ConnectionProvider.getConnection(), 5);
		
		Book result = service.delete(5);
		
		assertEquals(b, result);
	}
}
