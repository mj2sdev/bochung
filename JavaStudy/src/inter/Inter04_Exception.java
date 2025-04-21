package inter;

import java.util.Scanner;

public class Inter04_Exception {
	public static void main(String[] args) {
		/*
		 * 예외처리란
		 * 프로그램 코드에 의해서 수습할 수 있는 다소 미약한 오류로
		 * 프로그램 실행 시 발생할 수 있는 예외 발생에 대비해 코드를 작성하는 것
		 * 
		 * 목적
		 * 프로그램의 비 정상종료를 막고, 정상적인 실행상태를 유지하는 것
		 * 모든 예외의 최고 조상은 Exception 클래스 이다.
		 * 
		 * 종류
		 * try-catch-finally, throws 사용
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		System.out.println("a : ");
		a = scanner.nextInt();
		System.out.println("b : ");
		b = scanner.nextInt();
		
		try {
			// 예외가 발생할 수 있는 문장
			System.out.println(a / b);
		} catch(ArithmeticException e) {
			// 여기는 발생할 수 있는 예외 코딩
			System.out.println("0으로 나누기를 못 합니다. 다시 입력하세요.");
		} finally {
			// 생략 가능
			// 예외가 발생하든 안하든 실행하는 문장
			scanner.close();
		}
		
		int[] arr = new int[5];
		arr[0] = 0;
		int c = 10;
		int d = 10;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1 + arr[i];
		}
	}
}
