package com.arrays;

import java.util.Arrays;

public class ElementRemove {
	public static int[] method4(int[] x, int n) {
		int count = 0;
		for (int c : x) {
			if (c == n) {
				count++;
			}
		}
	
		int[] result = new int[x.length - count];
		int index = 0;
		for (int num : x) {
			if (num != n) {
				result[index++] = num;
				
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] n1 = new int[] { 1, 3, 5, 6, 3, 8, 9 };
		int n = 3;
		int[] result = method4(n1, n);
		System.out.println(Arrays.toString(result));
	}

}