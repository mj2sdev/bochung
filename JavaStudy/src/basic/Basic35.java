package basic;

import java.util.Scanner;

public class Basic35 {
	public static void main(String[] args) {
		// 반복문 비교해서 알아보기
		// 정수 6개를 입력받아 전체, 짝수, 홀수 들의 각각 합계, 개수를 출력하시오
		
		// 변수선언
		int score = 0;
		int totalScore = 0;
		int evenScore = 0;
		int oddScore = 0;
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		var scanner = new Scanner(System.in);
		
		for (int count = 1; count <= 6; count++) {
			System.out.printf("%d 번째 정수 값 입력 : ", count);
			score = scanner.nextInt();
			totalScore += score;
			total++;
			if ((score & 1) == 1) {
				oddScore += score;
				oddTotal++;
			} else {
				evenScore += score;
				evenTotal++;
			}
		}
		
		System.out.printf("%d %d %d %d %d %d\n",
				total, totalScore, oddScore, oddTotal, evenScore, evenTotal);
		
		total = totalScore = oddScore = oddTotal = evenScore = evenTotal = 0;
		int count = 6;
		while (count-- > 0) {
			System.out.printf("%d 번째 정수 값 입력 : ", 6 - count);
			score = scanner.nextInt();
			totalScore += score;
			total++;
			if ((score & 1) == 1) {
				oddScore += score;
				oddTotal++;
			} else {
				evenScore += score;
				evenTotal++;
			}
		}
		
		System.out.printf("%d %d %d %d %d %d\n",
				total, totalScore, oddScore, oddTotal, evenScore, evenTotal);
		
		total = totalScore = oddScore = oddTotal = evenScore = evenTotal = 0;
		count = 6;
		
		do {
			System.out.printf("%d 번째 정수 값 입력 : ", 7 - count);
			score = scanner.nextInt();
			totalScore += score;
			total++;
			if ((score & 1) == 1) {
				oddScore += score;
				oddTotal++;
			} else {
				evenScore += score;
				evenTotal++;
			}
		} while (--count > 0);
		
		System.out.printf("%d %d %d %d %d %d\n",
				total, totalScore, oddScore, oddTotal, evenScore, evenTotal);
	}
}
