package basic;

import java.util.Scanner;

public class Basic44 {
	public static void main(String[] args) {
		var scores = new int[3];
		var scanner = new Scanner("123 123 123");
		
		System.out.println("국어 : ");
		scores[0] = scanner.nextInt();
		System.out.println("영어 : ");
		scores[1] = scanner.nextInt();
		System.out.println("수학 : ");
		scores[2] = scanner.nextInt();
	}
}