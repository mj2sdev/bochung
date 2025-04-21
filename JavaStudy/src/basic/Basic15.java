package basic;

import java.util.Scanner;

public class Basic15 {
	public static void main(String[] args) {
//		조건연산 (삼항 연산자)
//		condition ? op1 : op2
//		condition 이 참(true)이면 op1을 실행, 거짓(false)이면 op2를 실행
		
		int s = (5 > 3) ? 5 : 3;
		System.out.println("result : " + s);
		
//		키보드로 정수를 입력받아 홀수이면 xx는 홀수 입니다. 짝수이면 xx는 짝수입니다.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input : ");
		int score = scanner.nextInt();
		
//		조건 연산자를 이용하여 3개의 정수 중 가장 큰 값, 가장 작은 값을 구하시오
//		3개의 값중에서 가장 큰 값을 찾는 방법
//		max = (a>b)?a:b;
//		max = (max>c)?max:c;
		
//		3개의 값 중 가장 작은 값 찾는 방법
	}
}
