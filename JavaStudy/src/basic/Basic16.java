package basic;

import java.util.Scanner;

public class Basic16 {
	public static void main(String[] args) {
		// 키보드로부터 3개의 정수를 입력받아 가장 큰 값을 찾아서 출력하시오
		// 정수 입력 : 70 90 80
		// 가장 큰 값은 90 입니다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int max = a > b ? a : b;
		max = max > c ? max : c;
		System.out.println("가장 큰 값 : " + max);
		
		scanner.close();
		
	}
}
