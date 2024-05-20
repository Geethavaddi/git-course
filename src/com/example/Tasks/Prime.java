package com.example.Tasks;

import java.util.Scanner;

public class Prime {
//using  boolean
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean x = true;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				x = false;
				break;
			}

		}
		if (x) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
//using method
//	public static boolean primeNum(int n) {
//	for(int i=2;i<=n;i++) {
//		if(n%i==0){
//			return false;
//		}
//	}
//	return true;
//	sc.close();
//	}
//public static void main(String[] args) {
//	if(primeNum(1)) {
//		System.out.println("prime");
//	}
//	else {
//		System.out.println("not prime");
//		
//	}
//	
//
//}
	



