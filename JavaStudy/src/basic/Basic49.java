package basic;

public class Basic49 {
	public static void main(String[] args) {
		int [][] arr;
		arr = new int[3][4];
		
		int[] tototototototal = { 22, 33, 44 };
		
		int[][] score = new int[][] {
			{ 11, 22, 33 },
			{ 44, 55, 66, 77, 88 },
			{ 99 }
		};
		
		for (var line : score) {
			for (int element : line) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
