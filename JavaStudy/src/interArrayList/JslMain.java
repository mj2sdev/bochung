package interArrayList;

import java.util.Scanner;

public class JslMain {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		int menu = 0;
		boolean loop = true;
		JslMethod jsl = new JslMethod();
		
		while (loop) {
			System.out.print("작업선택 [1]입력 [2]출력 [3]검색 [4]삭제 [5]수정 [0]종료 : ");
			menu = scanner.nextInt();
			
			switch (menu) {
				case 1 -> jsl.jslInsertIterator();
				case 2 -> jsl.getListInterator();
				case 3 -> {
					System.out.print("찾을 번호 입력 : ");
					int bno = scanner.nextInt();
					JslVO vo = jsl.getSelectByBno(bno);
					
					if (vo != null) jsl.getList(vo);
					else System.out.println("검색 결과가 없습니다.");
				}
				case 4 -> {
					System.out.print("삭제 번호 입력 : ");
					int bno = scanner.nextInt();
					int result = jsl.deleteByBno(bno);
					
					if (result == 1) System.out.println("삭제완료 ^^");
					else System.out.println("없는 번호인 듯?");
				}
				case 5 -> {
					System.out.print("수정 번호 입력 : ");
					int bno = scanner.nextInt();
					boolean kekka = jsl.editByBno(bno);
					if (kekka) System.out.println("수정 완료.");
					else System.out.println("번호 없음.");
				}
				case 0 -> loop = false;
			}
		}
	}
}
