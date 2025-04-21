package basic;

import java.util.Scanner;

public class Basic21 {
	public static void main(String[] args) {
		// 제어문
		// 명령문이 작성된 순서에 따라 순차적으로 수행하거나 실행순서를 바꿔야 하는 경우가 많다.
		// 종류 : 조건문, 반복문, 분기문
		
		// 단순 if 문
		
//		boolean 조건문 = false;
//		
//		if (조건문) {
//			// 조건문이 참이면 조건블럭을 실행하고 그렇지 않으면 블럭밖을 실행한다.
//		}
		
		// 어떤 값을 입력받아 짝수인지 알아보는 프로그램을 작성하시오.
		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 값 입력 : ");
//		int num = scanner.nextInt();
//		
//		String result;
//		if (num % 2 == 0) result = "짝수";
//		else result = "홀수";
//		System.out.printf("입력된 값은 %s 입니다.", result);
//		System.out.println("종료 ㅎㅎ");
		
		// 정수값을 입력받아 홀수이면 "홀수이다"를 출력하고 홀수값일때 입력받은 값에 100을 더하라.
//		System.out.println("정수를 입력하세요 :");
//		int テスト = scanner.nextInt();
//		if (テスト % 2 != 0) {
//			System.out.println("홀수이다!");
//			System.out.println(テスト + 100);
//		}
//		System.out.println("종료");
		
		// 정수 엑스가 90이상 100이하일 때 입력한 값에 100을 더한값을 출력하시오.
		
//		System.out.print("정수를 입력하세요 : ");
//		int test = scanner.nextInt();
//		
//		if (test >= 90 & test <= 100) {
//			System.out.println("출력값 : " + (test + 100));
//		}
//		
//		System.out.println("종료");
		
		// 문자열 c에 입력한 값이 "yes" 또는 "YES"와 같으면 "say i love you. thank you"을 출력하시오.
		System.out.println("문자열을 입력 하시오");
		String c = scanner.next();
		
		if (c.equals("yes") || c.equals("YES")) {
			System.out.println("say i love you. thank you");
		}
		else System.out.println("i'm not thing so");
		
		scanner.close();
	}
}
