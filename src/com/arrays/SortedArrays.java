package com.arrays;

import java.util.Arrays;

public class SortedArrays {
	// Approach 1: Using while loop
	public static int[] sArray(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}
		return mergedArray;
	}

	///// using for loop
	public static int[] s1Array(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			mergedArray[arr1.length + j] = arr2[j];
		}
		return mergedArray;
	}

	public static void main(String[] args) {
		int[] n = new int[] { 1, 2, 3 };
		int[] n1 = new int[] { 4, 5, 6 };
		int[] mergedArray1 = s1Array(n, n1);
		System.out.println("Merged Array (Approach 1): " + Arrays.toString(mergedArray1));

		/// using array methods
		int[] arr1Copy = Arrays.copyOf(n1, n1.length + n.length);
		System.arraycopy(n, 0, arr1Copy, n1.length, n.length);
		Arrays.sort(arr1Copy);
		System.out.println("Merged Array (Approach 2): " + Arrays.toString(arr1Copy));

		System.out.println(Arrays.toString(mergedArray1));
	}

}
