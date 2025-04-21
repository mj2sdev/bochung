package basic;

import java.util.Random;
import java.util.Scanner;

public class Basic39 {
	public static void main(String[] args) {
		// 점수 1~100을 입력받아서 최고점수, 최저점수를 구하여 출력하시오
		
		int max = 0;
		int min = 101;
		int counter = 0;
		var random = new Random();
		var scanner = new Scanner(System.in);
		
		while (true) {
			int score = random.nextInt(0, 101);
			if (score == 0) score = -1;
			System.out.println("정수 입력 : " + score);
			
			if (score == -1) break;
			if (score < min) min = score;
			if (score > max) max = score;
			
			if ((score & 1) == 1) counter++;
			if (counter > 6) break;
		}
		
		System.out.printf("max[%d], min[%d]", max, min);
	}
}
