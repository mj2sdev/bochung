package basic;

public class Basic36 {
	public static void main(String[] args) {
		int count = 10;
		int result = 0;
		do result += (count & 1) == 1 ? count : -count;
		while (count-- > 0);
		System.out.println("result : " + result);
	}
}
