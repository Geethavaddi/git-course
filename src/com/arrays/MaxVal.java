package com.arrays;

import java.util.Arrays;
import java.math.*;

public class MaxVal {
	public static int maxVal(int[] x) {
		///1. using sort
//		Arrays.sort(x);
//		return x[x.length-1];

//
		////2. using arrays
//		 return Arrays.stream(x).max().getAsInt();//or
		////3. using for loop
		int m = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > m) {
				m = x[i];
			}
		}
		///4. using for-each loop
		for (int n : x) {
			if (n > m) {
				m = n;
			}
		}
		return m;

	}

	public static void main(String[] args) {
		int[] y = new int[] { 1, 2, 3, 4 };
		System.out.println(maxVal(y));
	}
}