package com.arrays;
import java.util.Arrays;
import java.math.*;
public class SumNum {
	public static int sumVal(int[] x) {
		int summ = 0;

		for (int n : x) {
			summ += n;

		}
		return summ;
	}

	public static void main(String[] args) {

		int[] y = new int[] { 2, 5, 6, 7, 8, 9 };
		System.out.println(sumVal(y));
	}

}
