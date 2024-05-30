package Arrays2;

import java.util.Arrays;

public class Pairsum {
	public static void pairSum(int[] x, int num) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				int s = x[i] + x[j];
				if (num == s) {
					System.out.println(Arrays.toString(new int[] { x[i], x[j] }));
				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 1, 6, 7, 8 };
		int n = 5;
		pairSum(arr, n);

	}

}
