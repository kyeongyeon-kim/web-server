package member;

public class MemberService {
	private MemberDao dao;
	
	public MemberService(MemberDao dao) {
		this.dao = dao;
	}

	public boolean login(String memberid, String password) {
		int result = dao.countMember(memberid, password);
		return result == 1;
	}
}
