package Exceptionprograms;

import java.util.Scanner;

public class NFException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string");
//****		try {
//		String name=sc.next();
//		
//		for(int i=0;i<name.length();i++) {
//			
//	
//			int n=String.valueOf(name).charAt(i);
//		}
//		}	
//		catch(Exception e) {
//	System.out.println("found Number format Exception");

		String name = sc.next();
		try {
			int n = Integer.valueOf(name);// or
			int n1 = Integer.decode(name);// or
			int n2 = Integer.valueOf(name, 10);// or
			int n3 = Integer.parseInt(name);
			System.out.println(n3);
		} catch (Exception e) {
			System.out.print("Number format exception");
		}
		sc.close();
	}
}
