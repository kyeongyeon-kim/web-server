package bookapp;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bookapp.dbutil.ConnectionProvider;

public class TestBookDAO {
	// test도구 (외부 라이브러리)
	private static BookDAO dao;
	private Connection conn;

	// 해당클래스의 메소드들이 !테스트되기전!에 설정하기위한 어노테이션 설정
	@BeforeClass
	public static void setup() {
		dao = new BookDAOImpl();
	}
	// 각각의 테스트들이 공통적으로 수행해야하는 동작이 있다면 테스트 호출 전에 호출되는 메소드
	@Before
	public void makeConn() throws SQLException {
		conn = ConnectionProvider.getConnection();
		conn.setAutoCommit(false);
	}

	// 각각의 테스트 후에 호출되는 메소드
	@After
	public void rollbackAndClose() throws SQLException {
		conn.rollback();
		conn.close();
	}

	@Test
	public void daInit() {
		// dao 객체 생성 테스트
		BookDAO dao = new BookDAOImpl();
		assertNotNull(dao); // null이 아니면 통과
	}

	@Test
	public void doInsert() {
		// insert 메소드 테스트
		Book book = new Book();
		book.setTitle("테스트용책이름");
		book.setPrice(50000);
		int result = dao.insert(conn, book);

		assertNotEquals(0, result);
	}

	@Test
	public void daoSelect() {
		List<Book> list = dao.select(conn);

		assertNotNull(list);
	}

	@Test
	public void daoUpdate() {
		int result = dao.update(conn, new Book(2, "이번책 바꾸기", 3000));

		assertNotEquals(0, result);
	}

	@Test
	public void daoDelete() {
		int result = dao.delete(conn, 2);

		assertNotEquals(0, result);
	}
}
