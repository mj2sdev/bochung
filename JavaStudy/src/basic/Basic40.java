package basic;

import java.util.Scanner;

public class Basic40 {
	public static void main(String[] args) {
		/*
		 * 22기 학생들의 총점을 입력받아 최고 점수에서 최저 점수를 뺀 총합계를 구하시오
		 * 점수 입력 : 210 300 220 150 290
		 * 최고 점수 : 300
		 * 최저 점수 : 150
		 * 총합계 (총합계 - 최고점수 - 최저점수) : 
		 */
		
		var scanner = new Scanner("210 300 220 150 290");
		
		int count = 5;
		int max = 0;
		int min = 0;
		int total = 0;
		
		while (count-- > 0) {
			int score = scanner.nextInt();
			max = Math.max(score, max);
			min = Math.min(score, min);
			total += score;
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합계 (총합계 - 최고점수 - 최저점수) : " + (total - max - min));
	}
}
