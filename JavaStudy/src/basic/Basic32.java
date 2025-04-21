package basic;

public class Basic32 {
	public static void main(String[] args) {
		/**
		 * 반복문
		 * 어떤 작업을 반복적으로 수행하도록 한다.
		 * 종류 : for, while, do-while, 확장for문, 향상된 for 문이 있다.
		 * 반복횟수를 알고 있을때는 for문을, 그렇지 않을때는 while문을 사용한다.
		 * 
		 * 1 ~ 10 을 출력하시오.
		 */
		
		/*
		 * for (초기치; 조건식; 증감식){
		 *  실행문;
		 * }
		 * 1. 초기치를 실행. 한 번만 실행
		 * 2. 조건식을 실행. 조건식이 참이라면 실행문을 처리, 거짓이면 for{} 문을 빠져 나간다.
		 * 3. 증가치 실행.
		 * 4. 2번을 반복한다.
		 */
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	
		for (int i = 1; i < 100; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int sum = 0;
		for (int index = 1; index <= 10; index++) {
			sum += index;
			String operator = index < 10 ? " + " : " = "; 
			System.out.print(index + operator);
		}
		System.out.println(sum);
		
		int i = 1;
		int hap = 0;
		for (;;) {
			if (i <= 10) {
				System.out.println(i + " ");
				hap += 1;
			}
			if (i > 10) {
				break;
			}
			i++;
		}
		System.out.println(hap);
	}
}
