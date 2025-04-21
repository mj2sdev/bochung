package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic34 {
	public static void main(String[] args) {
		/**
		 * 무작위의 숫자를 키보드로 부터 입력받아 짝수의 합계와 짝수의 평균, 짝수의 개수를 구하시오
		 * 조건 : 평균은 입력받은 개수를 카운트하여 카운트 개수로 나누시오
		 * FOR 문을 이용하시오
		 * 정수 입력 : 413
		 * 정수 입력 : 4123
		 * 정수 입력 : 123
		 * 정수 입력 : -99 를 입력하면
		 * 짝수합계 : xxx, 짝수 평균 : xxx, 짝수 개수 출력
		 */
		
		// 변수 준비
		Scanner scanner = new Scanner(System.in);
		var basicFormatter = new DecimalFormat("#,###,##0");
		var averageFormatter = new DecimalFormat("###.0");
		
		int count = 0;
		int uraCount = 0;
		int sum = 0;
		double average = 0;
		double uraAverage = 0;
		int input = 0;
		
		// 반복입력
		for (;input != -99; uraCount++) {
			System.out.print("정수 입력 : ");
			input = scanner.nextInt();
			boolean isEven = input % 2 == 0;
			sum += isEven ? input : 0;
			count += isEven ? 1 : 0;
		}
		
		// 평균계산
		average = sum / (double) (count == 0 ? 1 : count);
		uraAverage = sum / (double) --uraCount;
		
		// 출력
		System.out.printf("짝수 평균 : [%s], 짝수 합계 : [%s], 짝수 갯수 : [%s]",
				averageFormatter.format(average), basicFormatter.format(sum), basicFormatter.format(count));
		
		scanner.close();
	}
}
