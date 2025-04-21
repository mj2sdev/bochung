package basic;

public class Basic03 {
	public static void main(String[] args) {
		// 프로그램 작성, 분석 가장먼저 필요한 기억장소 생각하기
		int index = 0;
		String name = "";
		int korean = 0;
		int english = 0;
		int math = 0;
		int total = 0;

		// 새로운 값을 저장하면 전에 저장됬던 값은 사라지고 값이 저장된다.
		index = 1111;
		name = "honggildong";
		korean = 100;
		english = 100;
		math = 100;

		total = korean + english + math;
		
		System.out.println("번호 : " + index);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
	}
}
