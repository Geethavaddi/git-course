package Arrays2;

public class DuplicateElement {
	public static void duplicateEle(int[] x) {
		for (int i = 0; i < x.length; i++) {
			int c = 0;
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					c = 1;
					break;

				}
			}
			if (c == 0) {
				System.out.println(x[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 3, 2, 5, 6, 3, 3, 4, 7, 2 };
		duplicateEle(arr);
	}

}
