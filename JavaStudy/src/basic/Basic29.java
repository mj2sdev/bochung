package basic;

import java.util.Scanner;

public class Basic29 {
	public static void main(String[] args) {
		// 임의의 정수 만들기
		// 객체 생성 없이 바로 사용이 가능한 유틸리티 메서드 들이 있다.
		// Math.random() : 0.0보다 크거나 같고 1.0보다 작은 double 값을 반환
		// 0.0 <= Math.random() < 1.0

		// 무작위 숫자 1,2,3
		System.out.println((int)(Math.random() * 3) + 1);
		// 주사위 숫자 1~6
		System.out.println((int)(Math.random() * 6) + 1);
		// 로또복권 숫자 1~45
		System.out.println((int)(Math.random() * 45) + 1);

		Scanner scanner = new Scanner(System.in);

		int com = (int) (Math.random() * 6) + 1;
		int me = (int) (Math.random() * 6) + 1;

		if (com < me) {
			System.out.println("나의 승리");
		} else if (com == me) {
			System.out.println("무승부");
		} else {
			System.out.println("컴퓨터 승리");
		}
	}
}
