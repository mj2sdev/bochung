package basic;

import java.util.Random;

public class Basic46 {
	public static void main(String[] args) {
		// 배열 요소중 최소, 최대값 구하기
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int count = 10;
		var array = new int[count];
		var random = new Random();
		
		for (int index = 0; index < count; index++)
			array[index] = random.nextInt(0, 100);
		
		print(array);
		
		for (int outter = 0; outter < count - 1; outter++) {
			for (int inner = outter + 1; inner < count; inner++) {
				if (array[outter] > array[inner]) {
					int temp = array[outter];
					array[outter] = array[inner];
					array[inner] = temp;
				}
			}
		}
		
		print(array);
		System.out.println("최소값 : " + array[0]);
		System.out.println("최대값 : " + array[count - 1]);
		
	}
	
	public static void print(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
