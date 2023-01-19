package userinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
	private IUserRepository repo;
	
	public UserService(IUserRepository repo) {
		this.repo = repo;
	}

	@Override
	public int addUser(String email, String firstName, String lastName) {
		try {
			return repo.addUser(email, firstName, lastName);
		} catch (SQLException e) {
			return 0;
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
