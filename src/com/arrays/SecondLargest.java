package com.arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void sArray(int[] arr1) {
		Arrays.sort(arr1);
		int n = arr1[arr1.length - 2];
		System.out.println(n);
	}

	public static void main(String[] args) {

		int[] new1 = new int[] { 9, 2, 3, 5, 6, 8, 2, 1, 0 };

		sArray(new1);
	}

}
