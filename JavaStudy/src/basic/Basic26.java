package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic26 {
	public static void main(String[] args) {
		// 이름 : 홍길동
		// 성별 [m]남자 [f]여자 : f
		// 부서 [1]교육부 [2]총무부 [3]인사부 : 2
		// 자바 : 30
		// 오라클 : 30
		// 스프링 : 30
		
		// 평균 80이상 시 합격
		// 학점은 이전 클래스 참고
		// 이름		성별 부서		자바	오라클	스프링	총점	평균		학점	합격여부
		// 홍길동		여자 총무부	30	30		30		90	30.0	F		불합격
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.0");
		
		String name, gender, mark, department = "", pass;
		int depart, java, oracle, spring, total;
		double average;
		
		System.out.print("이름 : ");
		name = scanner.next();
		
		System.out.print("성별 [m]남자, [f]여자 : ");
		gender = scanner.next();
		
		System.out.print("부서 [1]교육부, [2]총무부 [3]인사부 : ");
		depart = scanner.nextInt();
		
		System.out.print("자바 : ");
		java = scanner.nextInt();
		
		System.out.print("오라클 : ");
		oracle = scanner.nextInt();
		
		System.out.print("스프링 : ");
		spring = scanner.nextInt();
		
		total = java + oracle + spring;
		average = total / 3;
		pass = average >= 80 ? "합격" : "불합격";
		
		if (gender.toLowerCase().equals("m")) gender = "남자";
		else if (gender.toLowerCase().equals("f")) gender = "여자";
		
		if (depart == 1) department = "교육부";
		else if (depart == 2) department = "총무부";
		else if (depart == 3) department = "인사부";
		
		if (average > 90) mark = "A";
		else if (average > 80) mark = "B";
		else if (average > 70) mark = "C";
		else if (average > 60) mark = "D";
		else mark = "F";
		
		System.out.println("이름\t성별\t부서\t자바\t오라클\t스프링\t총점\t평균\t학점\t합격여부");
		System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%s\t%s\t%s",
				name, gender, department, java, oracle, spring, total, format.format(average), mark, pass);
		
		scanner.close();
	}
}
