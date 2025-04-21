package jdbc_member;

import java.util.List;
import java.util.Scanner;

import util.Menu;

public class MemberMain {
	public static void main(String[] args) {
		DatabaseManager databaseManager = DatabaseManager.getInstance();
		MemberDAO dao = new MemberDAO();
		
		String title = "[1]입력 [2]검색 [3]삭제 [4]수정 [0]탈출 : ";
		
		Menu menu = Menu.getInstance();
		Scanner scanner = new Scanner(System.in);
		
		menu.step(() ->{
			int custno = dao.custnoMax();
			System.out.print("이름 입력 : ");
			String name = scanner.next();
			System.out.print("연락처 입력 : ");
			String phone = scanner.next();
			System.out.print("주소 입력 : ");
			scanner.nextLine();
			String address = scanner.nextLine();
			System.out.print("가입일자 입력 : ");
			String joindate = scanner.next();
			System.out.print("등급 입력 : ");
			String grade = scanner.next();
			System.out.print("도시 입력 : ");
			String city = scanner.next();
			
			MemberVO vo = new MemberVO();
			vo.setCustno(custno);
			vo.setCustname(name);
			vo.setPhone(phone);
			vo.setAddress(address);
			vo.setJoindate(joindate);
			vo.setGrade(grade);
			vo.setCity(city);
			try {
				dao.insert(vo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}).step(() ->{
			System.out.println("[목록]");
			List<MemberVO> list = dao.select();
			
			for (MemberVO memberVO : list) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n",
						memberVO.getCustno(),
						memberVO.getCustname(),
						memberVO.getPhone(),
						memberVO.getAddress(),
						memberVO.getJoindate(),
						memberVO.getGrade(),
						memberVO.getCity()
						);
			}
			
		}).step(() -> {
			System.out.print("삭제할 번호 입력 : ");
			int custno = scanner.nextInt();
			boolean result = dao.deleteByCustno(custno) > 0;
			if (result) System.out.println("삭제 되었습니다.");
			else System.out.println("삭제 안되었습니다.");
		}).nice(title);
	}
}
