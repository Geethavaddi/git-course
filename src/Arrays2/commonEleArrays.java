package Arrays2;

public class commonEleArrays {
	public static void commonEle(int[] x, int[] y) {
		for (int n : x) {
			for (int c : y) {
				if (n == c) {
					System.out.print(c + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 6, 8, 3, 1, 5, 4 };
		int[] arr1 = new int[] { 2, 16, 8, 3, 10, 5, 4 };
		commonEle(arr, arr1);

	}

}
