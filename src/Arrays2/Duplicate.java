package Arrays2;

public class Duplicate {
	public static void pairSum(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 4, 4, 1, 6, 6, 7, 8 };

		pairSum(arr);

	}

}
