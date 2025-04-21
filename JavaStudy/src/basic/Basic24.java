package basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Basic24 {
	public static void main(String[] args) {
		// 사번 : 20250318
		// 이름 : 김삿갓
		// 직급 [1]마스터 [2]부사장 [3]사장 : 1
		// 기본급 : 1000000
		// 보너스 : 100000
		// 지급액 : 1,100,100
		
		// 조건
		// 지급이 1이면 기본급은 1000000, 보너스는 10%
		// 직급이 2이면 기본급은 2000000, 보너스는 5%
		// 직급이 3이면 기본급은 3000000, 보너스는 3%
		// 지급액 = 기본급 + 보너스
		// 직급을 선택하면 기본급, 보너스, 지급액이 계산되어 출력이 된다^^
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#,###,##0");
		String employeeNumber;
		String employeeName;
		int grade = 0;
		int basicSalary = 0;
		int lastSalary = 0;
		int bonus = 0;
		
		System.out.print("사번 : ");
		employeeNumber = scanner.next();
		System.out.print("이름 : ");
		employeeName = scanner.next();
		System.out.print("직급 [1]마스터 [2]부사장 [3]사장 : ");
		grade = scanner.nextInt();
		
		if (grade == 1) {
			basicSalary = 1000000;
			bonus = (int) (basicSalary * 0.1);
			lastSalary = basicSalary + bonus;
		} else if (grade == 2) {
			basicSalary = 2000000;
			bonus = (int) (basicSalary * 0.05);
			lastSalary = basicSalary + bonus;
		} else if (grade == 3) {
			basicSalary = 3000000;
			bonus = (int) (basicSalary * 0.03);
			lastSalary = basicSalary + bonus;
		} else {
			System.out.println("직급 입력 오류~");
		}
		System.out.println("기본급 : " + basicSalary);
		System.out.println("보너스 : " + bonus);
		System.out.printf("지급액 : %s", format.format(lastSalary));
		
		
	}
}
