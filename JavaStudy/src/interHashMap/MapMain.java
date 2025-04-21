package interHashMap;

import java.util.Scanner;

import interListMap.StudentMain;

public class MapMain {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var dao = new MapDAO();
		
		boolean flag = true;
		int menu = 0;
		
		while(flag) {
			System.out.print("select work ");
			System.out.print("[1]ipt [2]pnt [3]sch [4]del [5]mod [0]ext : ");
			menu = scanner.nextInt();
			
			switch(menu) {
			case 0 -> flag = false;
			case 1 -> dao.insertView();
			case 2 -> dao.getMapById();
			case 3 -> {
				System.out.print("검색 사원번호 입력 : ");
				int searchId = scanner.nextInt();
				dao.getDtoById(searchId);
			}
			case 4 -> {
				System.out.print("삭제할 사원번호 입력 : ");
				int deleteId = scanner.nextInt();
				boolean check = dao.deleteDtoById(deleteId);
				if (check) System.out.println("삭제완료");
				else System.out.println("삭제미완료");
			}
			case 5 -> {
				System.out.println("수정할 사원번호 입력 : ");
				int modifyId = scanner.nextInt();
				boolean check = dao.modifyById(modifyId);
				if (check) System.out.println("수정 완료");
				else System.out.println("수정 실패");
			}
			}
		}
	}
}
