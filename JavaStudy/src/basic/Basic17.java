package basic;

import java.util.Scanner;

public class Basic17 {
	public static void main(String[] args) {
		// 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
		// 총점, 평균, 합격여부를 구하여 출력하시오
		// 학생정보입력 :1 김학생 90 88 77
		// 번호 : 1
		// 이름 : 김학생
		// 총점 : 255
		// 평균 : 85
		// 합격여부 : 합격
		
		// 처리조건
		// 총점은 3과목을 모두 더한다
		// 평균은 총점을 과목수로 나누어 정수값만 사용한다
		// 합격여부는 평균이 85이상일 경우 합격, 아니면 불합격 문자를 출력한다
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정보를 입력하세요 : ");
		int index = scanner.nextInt();
		String name = scanner.next();
		int kor = scanner.nextInt();
		int eng = scanner.nextInt();
		int mat = scanner.nextInt();
		
		int total = kor + eng + mat;
		int average = total / 3;
		
		System.out.println("번호 : " + index);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("합격여부 : " + (average >= 85 ? "합격" : "불합격"));
		
		scanner.close();
		
	}
}
