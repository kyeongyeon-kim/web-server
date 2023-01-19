package userinfo;

import java.sql.SQLException;

public interface IUserRepository {
	public int addUser(String email, String firstName, String lastName) throws SQLException;
}
