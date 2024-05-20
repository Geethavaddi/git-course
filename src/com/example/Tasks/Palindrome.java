package com.example.Tasks;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int org = n;
		int rev = 0;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if (org == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
		sc.close();
	}
}
