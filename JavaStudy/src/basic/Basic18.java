package basic;

public class Basic18 {
	public static void main(String[] args) {
		// 반올림 하는 방법
		// 실수를 소수점 첫째자리에서 반올리한 정수 변환
		// long result = Math.round(4.52);
		
		double pi = 3.1415926535;
		double pi2 = Math.round(pi);
		System.out.println(pi2);
		
		// 소수 4째자리에서 반올림 하려면?
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi * 1000));
		System.out.println(Math.round(pi * 1000) / 1000);
		System.out.println(Math.round(pi * 1000) / 1000.);
	}
	
	
}
