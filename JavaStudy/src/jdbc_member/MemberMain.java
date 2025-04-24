package jdbc_member;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import util.Menu;
import util.Utils;

/**
 * 숙제 : 5번을 눌렀을 때 회원 매출을 조회하는 기능 만들기
 */
public class MemberMain {
	public static void main(String[] args) {
		DatabaseManager databaseManager = DatabaseManager.getInstance();
		MemberDAO dao = new MemberDAO();
		
		String title = "[1]입력 [2]검색 [3]삭제 [4]수정 [5]고트 [0]탈출 : ";
		
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
			System.out.println(Utils.toFields(new MemberVO()));
			List<MemberVO> list = dao.select();
			
			for (MemberVO memberVO : list) {
				System.out.println(Utils.toString(memberVO));
			}
			
		}).step(() -> {
			System.out.print("삭제할 번호 입력 : ");
			int custno = scanner.nextInt();
			boolean result = dao.deleteByCustno(custno) > 0;
			if (result) System.out.println("삭제 되었습니다.");
			else System.out.println("삭제 안되었습니다.");
			
		}).step(() ->{
			System.out.print("수정할 번호 입력 : ");
			int custno = scanner.nextInt();
			scanner.nextLine();
			if (custno == 0) return;
			
			System.out.print("주소 입력 : ");
			String address = scanner.nextLine();
			
			System.out.print("연락처 입력 : ");
			String phone = scanner.next();
			
			MemberVO vo = new MemberVO();
			vo.setAddress(address);
			vo.setPhone(phone);
			vo.setCustno(custno);
			
			boolean result = dao.update(vo);
			if (result) System.out.println("수정이 완료되었습니다.");
			else System.out.println("수정이 안되었습니다.");
			
		}).step(() -> {
			List<Map<String, Object>> list = dao.selectGOAT();
			
			for (Map<String, Object> map : list) {
				for (String string : map.keySet()) {
					System.out.print(map.get(string) + "\t");
				}
				System.out.println();
			}
			
		}).nice(title);
	}
}
