package inter;

import java.util.Scanner;

public class Inter04_ScoreMain {
	public static void main(String[] args) {
		// 성적처리, 입력, 출력, 검색, 수정, 삭제 종료 프로그램 맨들기
	
		System.out.println("성적처리 프로젝트");
		boolean flag = true;
		
		int num = 0;
		int menu = 0;
		var scanner = new Scanner(System.in);
		
		while (flag) {
			System.out.print("[1]입력[2]출력[3]검색[4]삭제[5]수정[0]종료 : ");
			menu = scanner.nextInt();
			
			switch (menu) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: flag = false;
			}
		}
	}
}
