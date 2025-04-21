package basic;

public class Basic19 {
	public static void main(String[] args) {
		// 대입연산자
		// 종류 : +=, -=, /=, %=, *=, ++, --
		int c = 1;
		int d = c++;
		System.out.println("후위 연산 값 : " + d);
		System.out.println("후위 연산후 C값 : " + c);
		
		int aa, bb;
		aa = bb = 3;
		int cc = aa++ - 2;
		int dd = ++bb - 2;
		System.out.println("cc 값 : " + cc);
		System.out.println("dd 값 : " + dd);
		
		// 누적연산자
		int x = 100;
		x = x + 10;
		x += 10;
		x = x - 10;
		x -= 10;
		x = x * 10;
		x *= 10;
		x = x / 10;
		x /= 10;
		
		
	}
}
