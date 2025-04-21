package basic;

import java.util.Random;
import java.util.Scanner;

public class Basic38 {
	public static void main(String[] args) {
		// 키보드로 부터 입력된 N개의 정수중에서 1-100사이의 정수 5개를 찾아서 합계를 출력하시오
		// 정수입력 : 10
		// 정수입력 : -10
		// 정수입력 : 20
		// ...
		int count = 0;
		int sum = 0;
		
		while (count < 5) {
			int input = new Random().nextInt(-100, 100);
			System.out.println("정수 입력 : " + input);
			
			if (input > 0 && input < 101) {
				count++;
				sum += input;
			}
		}
		System.out.println("합계 : " + sum);
	}
}
