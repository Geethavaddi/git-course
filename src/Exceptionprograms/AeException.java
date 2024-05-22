package Exceptionprograms;

import java.util.Scanner;

public class AeException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number");
		int n = sc.nextInt();
		System.out.println("enter second number");
		int n1 = sc.nextInt();
		try {
			int res = n / n1;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("found Arithmetic exception");

		}
		sc.close();
	}
}
