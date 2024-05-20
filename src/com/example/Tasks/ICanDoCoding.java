package com.example.Tasks;

class ICanDo {
	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		m1(list1);
	}

	public static void m1(int[] list1) {
		for (int i = 0; i <= list1.length - 1; i++) {
			if (list1[i] % 2 == 0) {
				System.out.println(list1[i]);
			}
		}

	}
}

public class ICanDoCoding {

	public static void main(String[] args) {
		System.out.println("i can do wonders");
	}

}
