package basic;

import java.util.Arrays;

public class Basic50 {
	public static void main(String[] args) {
		int[] score = { 100, 70, 90, 50 };
		int[] rank = { 1, 1, 1, 1 };
		
		for (int first = 0; first < score.length; first++) {
			for (int picker = 0; picker < score.length; picker++) {
				if (first == picker) continue;
				if (score[first] < score[picker])
					rank[first]++;
			}
		}
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(rank));
	}
}
