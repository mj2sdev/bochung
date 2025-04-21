package basic;

public class Basic42 {
	public static void main(String[] args) {
		int index = 0;
		int max = 5;
		while (index++ < max) {
			int temp = index;
			while (temp-- > 0)
				System.out.print("*");
			System.out.println();
		}
		
		while (max > 0) {
			int temp = max--;
			while (temp-- > 0)
				System.out.print("*");
			System.out.println();
		}
	}
}
