package userinfo;

public class User {
	private String email;
	private String firstName;
	private String lastName;
	
	public User(String email, String firstName, String lastName) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
