package basic;

import java.util.Scanner;

public class Basic25 {
	public static void main(String[] args) {
		/**
		 * 정수형 변수를 입력받아
		 * 점수가 100점 부터 10 점마다 A B C D
		 * 점수가 60점 이하면 F
		 * 점수는 0~100 사이를 입력받는다
		 * 
		 * 점수 입력 : 45
		 * 학점 : F
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();
		char rank = 'F';
		
		if (score > 90) rank = 'A';
		else if (score > 80) rank = 'B';
		else if (score > 70) rank = 'C';
		else if (score > 60) rank = 'D';
		
		if (score < 0 || score > 100)
			System.out.println("학점 처리 불가");
		else
			System.out.println("학점 : " + rank);
		
		scanner.close();
	}
}
