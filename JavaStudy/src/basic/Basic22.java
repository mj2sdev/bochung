package basic;

import java.util.Scanner;

public class Basic22 {
	public static void main(String[] args) {
		/**
		 *	if(조건문){
		 *		실행문1
		 *	}else{
		 *		실행문2
		 *	}
		 *	조건이
		 */
		// 정수 엑스 값을 키보드로 입력받아 짝수이면 "짝수" 홀수이면 "홀수"를 출력하시오
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("정수 엑스 값 입력 : ");
//		int x = scanner.nextInt();
//		
//		if (x % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
		// 입력받은 엑스 값이 80이상이면 "합격" 그렇지 않으면 "재시험"
//		System.out.print("정수 엑스 값 입력 : ");
//		int xx = scanner.nextInt();
//		
//		if (xx >= 80) System.out.println("합격");
//		else System.out.println("재시험");
		
		// 입력받은 엑스 값에 10을 더하고 5를 곱한값이 짝수이면 올~! 잘하는데 그렇지않으면 너 이름 머냐? 
		
		System.out.print("정수 값 입력 : ");
		int input = scanner.nextInt();
		
		int whatsyourname = (input + 10) * 5;
		if (whatsyourname % 2 == 0) {
			System.out.println("올~! 잘 하는군 ^^");
		} else {
			System.out.println("너 이름 머냐??? -,.-");
		}
	}
}
