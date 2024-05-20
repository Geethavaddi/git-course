package com.example.Tasks;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int org = n;
		int digit = String.valueOf(n).length();
		int res = 0;
		while (n != 0) {
			int dig = n % 10;
			res += Math.pow(dig, digit);
			n = n / 10;
		}
		if (res == org) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
