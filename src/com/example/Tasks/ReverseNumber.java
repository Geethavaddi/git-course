package com.example.Tasks;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//using for loop reversing a number
		int rev = 0;
		for (; n != 0;) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;

		}
		System.out.println(rev);
// using while loop
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println(rev);
// using do while loop
		do {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		} while (n != 0);
		System.out.println(rev);
		sc.close();
	}

}
