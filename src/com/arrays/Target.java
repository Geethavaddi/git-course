package com.arrays;

public class Target {
	public static int tarGet(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		System.out.println(tarGet(arr1, 3));
	}

}

