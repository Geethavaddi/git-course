package Arrays2;

public class Occurence {
	public static int occurance(char[] x, char ch) {
		int c = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			if (ch == x[i]) {
				c += 1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		char[] arr = new char[] { 'a', 'b', 'c', 't', 'b', 'h', 'b', 'c' };
		System.out.println(occurance(arr, 'b'));

	}

}
