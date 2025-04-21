package inter;

public class Member {
	// 멤버변수
	String name;
	String userid;
	String password;
	String tel;
	String email;
	String number;
	
	public Member() {}
	
	public Member(String name, String userid, String password, String tel, String email) {
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.tel = tel;
		this.email = email;
	}
	
	public void title() {
		System.out.println("회원목록");
		System.out.println("번호\t이름\t아이디\t패스워드\t전화번호\t이메일");
	}
	
	public void memberPoint() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
				number, name, userid, password, tel, email);
	}
}
