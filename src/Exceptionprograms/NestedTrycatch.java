package Exceptionprograms;

import java.util.Scanner;

public class NestedTrycatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n = sc.nextInt();
		System.out.println("enter second number");
		int n1 = sc.nextInt();
		System.out.println("enter  number for array size");
		int n2 = sc.nextInt();
		System.out.println("enter  number for check");
		int n3 = sc.nextInt();
		int[] arr = new int[n2];
		try {
			int res = arr[n3];
			System.out.println(res);
			try {
				int res1 = (n / n1);
				System.out.println(res1);
			} catch (Exception e) {
				System.out.println("arithmetic exception found");
			}
		} catch (Exception e) {
			System.out.println("array index out of bound exception  found");
		}

	}

}
