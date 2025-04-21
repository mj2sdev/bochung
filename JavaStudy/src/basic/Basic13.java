package basic;

import java.util.Scanner;

public class Basic13 {
	public static void main(String[] args) {
		// 논리연산자
		// 두개 이상의 조건을 연결하여 하나의 식으로 표현하여 true 또는 false의 논리값을 구하는 연산자
		
		// 종류
		// and( && ) 연산자 : 두 개의 조건이 참일때만 참
		// or ( || ) 연산자 : 두 개의 조건 중 한개라도 참이면 결과는 참
		// not( !  ) 연산자 : 조건의 결과를 반전시킴 (참 -> 거짓)
		boolean result = false;
		System.out.println(result);
		System.out.println(!result);
		System.out.println(3 < 5);
		System.out.println();
		
		// 관계연산자와 논리연산자가 있으면 관계연산처리 후 논리연산ㅇ르 실행한다
		
		// 키보드로부터 정수를 입력받아 입력받은 값이 80~90 사이면 true, 그렇지 않으면 false를 출력하시오
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int score = scanner.nextInt();
		boolean results = (score >= 80 && score <= 90);
		System.out.println("입력 결과 : " + results);
		scanner.close();
		
		
	}
}

		
		