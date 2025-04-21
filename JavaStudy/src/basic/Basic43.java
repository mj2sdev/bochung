package basic;

public class Basic43 {
	public static void main(String[] args) {
		int temp = fibo(10);
		System.out.println(temp);
	}
	public static int fibo(int num) {
		if (num < 1) return 0;
		return fibo(num - 1) + num;
	}
}
