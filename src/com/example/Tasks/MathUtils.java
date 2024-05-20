package com.example.Tasks;

public class MathUtils {

	public static int add(int x, int y) {
		return x + y;
	}

	public static int substract(int x, int y) {
		return x - y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {

		System.out.println(add(10, 20));
		System.out.println(substract(30, 40));
		System.out.println(multiply(20, 10));
		System.out.println(divide(40, 2));

	}

}
