package Arrays2;

import java.util.Arrays;

public class Missing {
	public static void findMissing(int[] x) {
		Arrays.sort(x);
		int big = x[x.length - 1];
		int[] missingNumbers = new int[big];
		int k = 0;
		int s = x[0];

		for (int i = s; i < big; i++) {
			if (k < x.length && i == x[k]) {
				k++;
			} else {
				missingNumbers[i] = i;
			}
		}

		System.out.println("Missing number(s): ");
		for (int i : missingNumbers) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 12, 14, 15, 16 };
		findMissing(arr);
	}
}
