package basic;

import java.util.Random;
import java.util.Scanner;

public class Basic37 {
	public static void main(String[] args) {
		/**
		 * 1 ~ 100사이의 임의의 숫자를 랜덤하게 만들고
		 * 내가 컴퓨터에서 만들어진 임의의 숫자를 맞추는 업-다운 게임 만들기
		 * 정수 입력 : 68
		 * 다운 해~
		 * 정수 입력 : 45
		 * 업 해~
		 * 정수 입력 : 55
		 * 3번에 맞추었군요!
		 */
		var scanner = new Scanner(System.in);
		int random = new Random().nextInt(1, 101);
		int input = 0;
		int count = 0;
		while (input != random) {
			System.out.print("정수 입력 : ");
			input = scanner.nextInt();
			String message = input > random ? "다운 해~" : "업 해~";
			System.out.println(message);
			count++;
		}
		System.out.printf("%d번에 맞추셨군요!\n", count);
		scanner.close();
	}
}
