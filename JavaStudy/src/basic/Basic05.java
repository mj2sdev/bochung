package basic;

public class Basic05 {
	public static void main(String[] args) {
		// 상품 리스트
		// 제품번호 제품명 수량 단가  총액
		// A001   캠핑카 2   1000 2000
		
		// 총액은 수량*단가 이다
		
		// 변수 선언
		String number = "A001";
		String productName = "캠핑카";
		int amount = 2;
		int price = 1000;
		
		// 수식
		int totalPrice = amount * price;
		
		// 출력
		System.out.println("\t상품 리스트");
		System.out.println("제품번호\t제품명\t수량\t단가\t총액");
		System.out.println(number + "\t" + productName + "\t" + amount + "\t" + price + "\t" + totalPrice);
	}
}
