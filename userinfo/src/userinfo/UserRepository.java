package userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbutil.ConnectionProvider;

public class UserRepository implements IUserRepository {
	
	@Override
	public int addUser(String email, String firstName, String lastName) throws SQLException {
		String query = "INSERT INTO userinfo (email, firstname, lastname) VALUES (?, ?, ?)";
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(query)) {
			stmt.setNString(1, email);
			stmt.setNString(2, firstName);
			stmt.setNString(3, lastName);
			
			return stmt.executeUpdate();
		}
	}
}
