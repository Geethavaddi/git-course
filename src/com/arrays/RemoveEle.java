package com.arrays;

import java.util.Arrays;

public class RemoveEle {
	public static void method3(int[] x) {
		int index = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				x[index++] = x[i];

			}
		}
		while (index < x.length) {
			x[index++] = 0;

		}
	}

	public static void main(String[] args) {
		int[] n = new int[] { 1, 0, 4, 0, 5, 6, 0, 4 };
		method3(n);
		System.out.println(Arrays.toString(n));

	}

}
