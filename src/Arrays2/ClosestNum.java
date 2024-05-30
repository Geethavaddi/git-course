package Arrays2;
import java.util.Arrays;
public class ClosestNum {
	public static int closeNum(int[] x, int num) {
		int c = x[0];
		int mindiff = Math.abs(num - c);
		for (int i = 1; i < x.length; i++) {
			int diff = Math.abs(x[i] - num);
			if (diff < mindiff && x[i] != num) {
				mindiff = diff;
				c = x[i];
			}

		}

		return c;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 2, 5, 9, 11, 13 };
		int num = 7;
		System.out.println(closeNum(arr, num));

	}

}
