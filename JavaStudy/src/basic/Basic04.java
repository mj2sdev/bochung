package basic;

public class Basic04 {
	public static void main(String[] args) {
		
		// 데이터 타입의 종류
		
		// 기본형
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 논리형 : boolean
		// 문자형 : char
		
		// 참조형
		// 기본형 8개를 제외한 나머지
		// 메모리 주소를 지정
		// String, 배열, ...
		
		// 형변환(Add Cast)
//		int idx=1111;
		// long idx=2222;
//		long bno=idx;
		// idx변수에 저장된 값을 8바이트 크기의 정수형 변수 bno에 저장하시오
		// int kbs=bno;
		// 왜 오류?? 8Byte 크기의 bno 값을 4byte 크기의 kbs 변수에 저장할 수 없다
		// 해결 방법 : 형변환을 해준다
//		int kbs = (int) bno;
		// 8바이트 크기의 bno에 저장된 값을 4byte 크기로 형변환 해서 4바이트 크기의 kbs 라는 변수에 저장하시오
//		float a = 123.456f; // float형 변수에 값을 저장할 때는 데이터 뒤에 f를 붙인
//		double b = 123.456d; // double 형은 데이터 뒤에 d를 붙여야 하는데 생략할 수 있다
//		
//		byte c = 127;
		//byte d=128; 에러 최대 127까지 저장할 수 있다
		
//		double d = a;
//		float e = (float)d;
		
		// int tot = 300;
		// int tot = 300.0; 에러 8바이트 크기의 실수값을 4바이트 크기의 정수형 변수에 저장할 수 없다.
		
		// long ave = (long) 100.0f; // 100.0이 100으로 변환하여 ave에 저장된다
		
		// 연산결과
		// 정수와 정수 연산하면 정수가 된다
//		정수와 실수가 연산하면 실수가 된다
//		실수와 정수가 연산하면 실수가 된다
//		실수와 실수가 연산하면 실수가 된다
		System.out.println(1+1);
	}
}
