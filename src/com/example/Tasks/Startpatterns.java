package com.example.Tasks;

class Startpatterns {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//without using for loop
class Practice {

	public static void printRow(int n) {
		if (n == 0) {
			return;
		}
		System.out.print("*");
		printRow(n - 1);
	}

	public static void changeRow(int n) {
		if (n == 0) {
			return;
		}
		changeRow(n - 1);
		printRow(n);
		System.out.print("\n");

	}

	public static void main(String[] args) {
		int n = 5;
		int numStars = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			numStars++;
			System.out.println();
		}
	}
}

// using while loop
class UsingWhile {
	public static void main(String[] args) {

		int n = 5;

		String row = "*";
		int i = 1;
		while (i <= n) {
			row += "*";
			i++;
			System.out.println(row);

		}
	}
}

//using for loop and string methods
class UsingString {
	public static void pyramid(int height) {
		int h1 = height;
		for (int i = 1; i <= h1; i++) {
//				System.out.print(" ".repeat(height-1));
			System.out.print((i + " ").repeat(i));
			height -= 1;
		}
	}

	public static void main(String[] args) {
		pyramid(4);
	}

}





