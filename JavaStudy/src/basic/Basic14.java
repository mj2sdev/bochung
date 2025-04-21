package basic;

import java.util.Scanner;

public class Basic14 {
	public static void main(String[] args) {
		// 입력받은 정수값이 80~90 사이이거나 7의 배수이면 true 아니면 false 출력
		//　リュリョクされた整数値が　80から90までと七の杯数ならtrueじゃないとfalseを出力。
		
		Scanner scanner = new Scanner(System.in);
		int score;
		boolean result;
		
		System.out.print("정수를 입력하세요 : ");
		score = scanner.nextInt();
		result = score >= 80;
		result = result && (score <= 90);
		result = result || (score % 7 == 0);
		
		System.out.println("결과 : " + result);
		
		scanner.close();
	}
}



















