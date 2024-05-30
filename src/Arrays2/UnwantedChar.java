package Arrays2;

import java.util.Arrays;

public class UnwantedChar {
	private static String[] name(String[] arr, String regex) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].replaceAll(regex, "");
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] arrs = { "ln123", "lavs456", "raju789" };
		System.out.println(Arrays.toString(name(arrs, "[j-k]")));
	}

}
	

