package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic09 {
//	class: 설계도. 설계도를 왜 만들어?? 객체를 생성하기 위해
//	접근 제한자 : private, default, protected, public
	public static void main(String[] args) {
//		method : ~를 실행하는 기능 -> 메서드명()
//		static : 객체생성드를 실행할 수 있다
//		void : 호출한 곳으로 리턴해줄 값이 없다

//		제품조회
//		제품코드 제품명     사이즈 매입단가  중고단가 출고수량 매출이익
//		B001   경량적색바퀴 150mm ￦3,000 ￦3,600 30     출고수량*(출고단가 - 매입단가)
//		String String    String int    int    int     int

		DecimalFormat decimalFormat = new DecimalFormat("#,##0");

		String result = decimalFormat.format(123456);
		System.out.println(result);
		

		Scanner scanner = new Scanner(System.in);

		System.out.print("제품코드 : ");
		String pcode = scanner.next();

		System.out.print("제품명 : ");
		String pname = scanner.next();

		System.out.print("사이즈 : ");
		String size = scanner.next();

		System.out.print("매입단가 : ");
		int price = scanner.nextInt();

		System.out.print("출고단가 : ");
		int uprice = scanner.nextInt();

		System.out.print("수량 : ");
		int quantity = scanner.nextInt();

		int profit = quantity * (uprice - price);

		// new : 객체를 생성하는 키워드다

		// 출력문을 만든다
		System.out.println("제품조회");
		System.out.println("제품코드\t제품명\t사이즈\t매입단가\t중고단가\t출고수량\t매출이익");
		System.out.printf("%s\t%s\t%s\t￦%d\t￦%d\t%d\t￦%d\n", pcode, pname, size, price, uprice, quantity, profit);

		// 처리 데이터를 키보드로 입력 받아 변수에 저장하는 방법
		
		scanner.close();
	}
}
