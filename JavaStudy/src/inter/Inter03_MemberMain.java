package inter;

import java.util.Scanner;

public class Inter03_MemberMain {
	public static void main(String[] args) {
		Member[] array = new Member[3];
		
		var scanner = new Scanner(System.in);
		
		for (int index = 0; index < array.length; index++) {
			System.out.println("이름 아이디 패스워드 전화번호 이메일");
			String name = scanner.next();
			String userid = scanner.next();
			String password = scanner.next();
			String tel = scanner.next();
			String email = scanner.next();
			
			Member member = new Member(name, userid, password, tel, email);
		}
	}
}
