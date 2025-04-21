package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic23 {
	public static void main(String[] args) {
		/**
		 * 상품 구매가격 입력 : 40000
		 * 총 지출금액      : 36,000원
		 * 쿠폰금액        : 5,000원
		 * 주차료         : 0원
		 * 
		 * 상품 가격이 4만월 이상이면 10% 할인과 5000원 쿠폰 지급, 주차권 무료
		 * 그렇지 않으면 5% 할인과 주차료 500원을 추가한다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#,###");
		int cutline = 40000;
		int basicCoupon = 5000;
		int basicParking = 500;
		
		System.out.print("상품 구매가격 입력\t: ");
		int price = scanner.nextInt();
		int coupon = price >= cutline ? basicCoupon : 0;
		int parkingPrice = price >= cutline ? 0 : basicParking;
		
		if (price >= cutline) price *= 0.9;
		else price *= 0.95;
		
		System.out.printf("총 지출금액\t: %s원\n", format.format(price));
		System.out.printf("쿠폰금액\t\t: %s원\n", format.format(coupon));
		System.out.printf("주차료\t\t: %s원\n", format.format(parkingPrice));
		
		scanner.close();
	}
}
