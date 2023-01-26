package guestbook.model;

public class Message {
	private int id;
	private String message;
	private String memberid;
	
	public Message() {
		
	}
	
	public Message(String message, String memberid) {
		super();
		this.message = message;
		this.memberid = memberid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", memberid=" + memberid + "]";
	}
	
	
	
}
