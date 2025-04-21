package interListMap;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		StudentMain.menu("학점관리 프로그램 [1]걍버튼 [2]삭제 : ", StudentMain::push);
	}
	
	private static void push() {
		System.out.println("1번 누르셨고요");
		System.out.println("1번의 상세 로직");
		System.out.println("1번 끝났어요");
	}
	

	public static <T>void menu(String title, Runnable... runnable) {
		var scanner = new Scanner(System.in);
		
		int menu = 0;
		while (true) {
			System.out.print(title);
			menu = scanner.nextInt();
			
			if (menu == 0) return;
			if (runnable.length < menu) continue;
			runnable[menu -1].run();
		}
	}
}
