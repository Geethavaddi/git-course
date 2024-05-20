package com.example.Tasks;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1, res = 0;
//		System.out.println(n1+" "+n2);
		for (int i = 1; i < n; i++) {
			System.out.println(res);
			n1 = n2;
			n2 = res;
			res = n1 + n2;

		}
		sc.close();
	}

}
