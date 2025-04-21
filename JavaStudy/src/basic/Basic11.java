package basic;

import java.util.Scanner;

public class Basic11 {
	public static void main(String[] args) {
		// 연산자
		// 연산자는 연산을 수행하는 기호
		// 연산자의 종류 : 산술연산, 관계연산, 논리연산자, 대입연산자, 비트연산
		
		// 산술연산자의 종류
		// 더하기(+), 빼기(-)
		
		int a = 10;
		int b = 3;
		System.out.println("a+b=" + (a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		// 키보드로 부터 정수값을 입력받아 짝수이면 true, 홀수이면 false 출력하시오
		// 정수입력 : 5
		// 결과 : false
		// 정수입력 : 6
		// 결과 : true
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int s = scanner.nextInt();
		int temp = 0;
		
		temp = s / 60;
		int minute = temp % 60;
		
		temp = temp / 60;
		int hour = temp;
		
		int second = s % 60;
		
		System.out.printf("입력된 시간 : %s:%s:%s", hour, minute, second);
						
		
		// 정수입력 : 5000
		// 5000초는 1시간 23분 20초 입니다
		// 힌트 : 60으로 나눈 나머지는 초, 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		// 60으로 나는 몫을 다시 60으로 나눈 몫은 시간이 된다
		
		
		/**
		 * 
		 */
		
		scanner.close();
	}
}