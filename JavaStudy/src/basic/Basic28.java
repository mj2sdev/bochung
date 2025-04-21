package basic;

import java.util.Scanner;

public class Basic28 {
	
	public static void main(String[] args) {
		// 연습문제
		// 정수 x : 20
		// 정수 y : 10
		// 계산기 [더하기(+), 빼기(-), 곱하기(*), 나누기(/), 나머지(%) : %
		// 결과 : 0

        Scanner sc = new Scanner(System.in);

				System.out.print("정수 x : ");
        int x = sc.nextInt();
				System.out.print("정수 y : ");
        int y = sc.nextInt();

				
        System.out.print("계산기 [더하기(+), 빼기(-), 곱하기(*), 나누기(/), 나머지(%) : ");
        
        String oper = sc.next();
				
				int ret = 0;

        switch (oper) {
            case "+":
                ret = x + y;
                break;
            case "-":
                ret = x - y;
                break;
            case "*":
                ret = x * y;
                break;
            case "/":
                ret = x / y;
                break;
            case "%":
                ret = x % y;
                break;
        }

				System.out.println("결과 : " + ret);
	}

}



