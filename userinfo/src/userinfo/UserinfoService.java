package userinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserinfoService {
	public int insertUserinfo(String email, String firstName, String lastName) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "INSERT INTO userinfo (email, firstName, lastName) VALUES (?, ?, ?)";
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, email);
			stmt.setString(2, firstName);
			stmt.setString(3, lastName);
			
			return stmt.executeUpdate();
		}
	}

	public List<User> selectAllUserinfo() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "SELECT email, firstname, lastname FROM userinfo";
		List<User> list = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
			
			while (rs.next()) {
				String email = rs.getString(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				
				list.add(new User(email, firstName, lastName));
			}
		}
		return list;
	}
}
