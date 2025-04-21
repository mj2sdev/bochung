package basic;

import java.util.Scanner;

public class Basic30 {
	public static void main(String[] args) {
		
		// 가위(1) 바위(2) 보(3) 게임
		Scanner scanner = new Scanner(System.in);
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.print("ちゃん(1) けん(2) ぽ(3) 入力 : ");
		int me = scanner.nextInt();
		
		String com2, me2;
		if (com == 1) com2 = "✂️";
		else if (com == 2) com2 = "🪨";
		else com2 = "🖐️";
		
		if (me == 1) me2 = "✂️";
		else if (me == 2) me2 = "🪨";
		else me2 = "🖐️";
		
		System.out.printf("結果 :　ええ、私[%s] vs パソコン[%s]\n", me2, com2);
		
		int result = com - me;
		if (result == 1 || result == -1) System.out.println("私の勝ち");
		else if (result == 0) System.out.println("引き分け");
		else System.out.println("💻の勝ち");
//		switch(com - me) {
//		case 1: case -1:
//			System.out.println("私の勝ち");
//			break;
//		case 0:
//			System.out.println("引き分け");
//			break;
//		default:
//			System.out.println("💻の勝ち");
//		}
	}
}