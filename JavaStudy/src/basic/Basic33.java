package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic33 {
	public static void main(String[] args) {
		// 무작위의 정수6개를 키보드로 부터 합계와 평균을 구하시오
		// 조건 : 평균은 6으로 나누지 말고 입력받은 개수를 카운트하여 카운트 개수로 나누시오
		// for 문을 이용하십쇼
		
		// 합계 : xxx, 평균 : xxx
		DecimalFormat sumFormat = new DecimalFormat("#,###,##0");
		DecimalFormat averageFormat = new DecimalFormat("#,###.0");
		Scanner scanner = new Scanner(System.in);
		
		double average = 0;
		int sum = 0;
		int count = 6;
		
		System.out.print("定数入力 : ");
		for (int index = 0; index < count; index++) {
			sum += scanner.nextInt();
		}
		
		average = sum / count;
		System.out.printf("後継 : [%s], 平均 : [%s]", sumFormat.format(sum), averageFormat.format(average));
	}
}
