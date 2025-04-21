package basic;

import java.util.Scanner;

public class Basic07 {
	public static void main(String[] args) {
		// 참가번호, 참가자명, 주민번호, 참가부분, 지역을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오
		
		// 참가번호 : 0002
		// 참가자명 : 김경연
		// 주민번호 : 990101-1000001
		// 참가부분 : [1:기악, 2:민요, 3:무용, 4:판소리] > 2
		// 지역 : 남원
		
		// 국악 경연 대회
		// ----------------------------------------
		// 참가번호 참가자명 주민번호         참가부분 지역
		// ----------------------------------------
		// 0002   김경연   990101-1000001 2      남원
		String line = "-------------------------------------------";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("참가번호 : ");
		int number = scanner.nextInt();
		
		System.out.print("참가자명 : ");
		String name = scanner.next();
		
		System.out.print("주민번호 : ");
		String id = scanner.next();
		
		System.out.print("참가부분 : [1:기악, 2:민요, 3:무용, 4:판소리] > ");
		int part = scanner.nextInt();
		
		System.out.print("지역 : ");
		String area = scanner.next();
		
		System.out.println("\t\t국악 경연 대회");
		System.out.println(line);
		System.out.println("참가번호\t참가자명\t주민번호\t\t참가부분\t지역\t");
		System.out.println(line);
		System.out.println(number + "\t" + name + "\t" + id + "\t" + part + "\t" + area);
		
		scanner.close();
	}
}
