package Arrays2;

import java.util.Arrays;

public class FirstandlastIndex {
	public static void firstLast(int[] x, int n) {
		int first = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == n) {
				first = i;
				break;
			}

		}

		int last = first;
		for (int j = x.length - 1; j >= first; j--) {
			if (x[j] == n) {
				last = j;
				break;

			}

		}
//		if(first!=last) {
//		System.out.println(first);
//		System.out.println(last);
//		}
//		else {
//			System.out.println(first+" "+last);
//	}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1, 4, 5, 6, 7, 8 };
		firstLast(arr, 1);
//		System.out.println(Arrays.toString(arr));

	}

}
