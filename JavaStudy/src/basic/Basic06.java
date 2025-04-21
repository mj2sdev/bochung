package basic;

import java.util.Scanner;

public class Basic06 {
	// class : 설계도
	// 접근제한자 : private, default, protected, public
	// * public, protected 를 제일 많이 사용
	public static void main(String[] args) { // main 메서드
		// public : 누구나 접근제한 없이 사용
		// static : 객체생성 없이 main() 메서드 사용 가능
		
		// 키보드로부터 학번, 이름, 국어, 영어, 수학 점수를 입력받아 아래와 같이 출력하는 프로그램을 완성하시오
		
//		 데이터 입력
//		학번 : 2501 
//		이름 : 홍길동 
//		국어 : 60 
//		영어 : 82 
//		수학 : 46
//		총점 : 
//		평균 :
		
		Scanner sc = new Scanner(System.in);
		// new : 객체를 생성하는 키워드
		// scanner 객체 생성 후 사용할 수 있는 메서드
		// 문자데이터 입력 : next()
		// 정수값 입력 : nextInt(), nextLong()
		// 실수값 입력 : nextFloat(), nextDouble()
		
		// 데이터 형
		// 기본형 : 아래 8가지
		// 정수형 : byte, short, int, long
		// 실수형 : float, double
		// 문자형 : char
		// 논리형 : boolean
		
		// 참조형 : 기본형을 제외한 나머지는 참조형이다. 주소를 참조한다.
		// String, 배열, ...
		
//		int num=0;
//		String name="";
//		int kor=0;
//		int eng=0;
//		int mat=0;
//		int tot=0;
//		double ave=0;
		
//		num=1111;
//		name="ghdrlfehd";
//		kor=100; // 새로운 값을 저장하면 이전값은 사라지고 새로운 값으로 저장된다.
//		eng=100;
//		mat=100;
		
		System.out.print("학번 : ");
		// nextInt() : 키보드로부터 정수값을 입력받아 num 변에 저장하시오
		// next() : 키보드로부터 문자열을 입력받아 name 변수에 저장하시오
		// 
		int num = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();

		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double ave = tot / 3.;
		
		System.out.println(num + name);
	
		// 문자열과 숫자를 더하면 문자열을 이어붙힌다.
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : ",ave);
		
		sc.close();
	}
}
