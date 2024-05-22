package Exceptionprograms;

import java.util.Scanner;

public class AIOBounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of an array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter number to find the AIOB Exception");
		int n1 = sc.nextInt();
		try {
			System.out.println(arr[n1]);
		} catch (Exception e) {
			System.out.println("Array Index out of bounds Exception");
		}
		sc.close();
		System.out.println("hello");
	}

}
