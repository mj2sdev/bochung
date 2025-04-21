package basic;

public class Basic41 {
	public static void main(String[] args) {
		// 키보드로 부터 수금액을 입력받아 화폐단위별 매수를 구하시오
		// 화폐단위는 5만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 10원, 5원, 1원
		// 수금액 : 725641
		
		int money = 725641;
		Integer excalibur = 50000;
		
		do {
			int result = money / excalibur;
			money %= excalibur;
			System.out.printf("%d원\t: %d\n", excalibur, result);
			excalibur /= excalibur.toString().charAt(0) == '5' ? 5 : 2;
		} while(excalibur > 0);
	}
}
