package web06;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class MyContextListener implements ServletContextListener {
	public static DataSource dataSource;
	
	// 미리 해놓을 수 있는 작업들을 처리해 줄 수 있는 컨텍스트리스너
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("어플리케이션 시작시 발생하는 이벤트를 처리 가능합니다.");
		
		System.out.println("어플리케이션 전역에서 사용할 설정을 미리 수행합니다.");
		
		ServletContext context = sce.getServletContext();
		String jdbcUrl = context.getInitParameter("jdbcUrl");
		String jdbcClassName = context.getInitParameter("jdbcClassName");
		String jdbcUser = context.getInitParameter("jdbcUser");
		String jdbcPassword = context.getInitParameter("jdbcPassword");
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(jdbcClassName);
		ds.setUrl(jdbcUrl);
		ds.setUsername(jdbcUser);
		ds.setPassword(jdbcPassword);
		dataSource = ds;
		
	}
	
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
