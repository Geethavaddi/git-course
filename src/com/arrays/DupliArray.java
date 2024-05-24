package com.arrays;

public class DupliArray {
	public static boolean tarGet(int[] arr) {
for (int i = 0; i < arr.length;i++ ) {
	for (int j=i+1; j < arr.length;j++ ) {	
if (arr[i]==arr[j]) {
	return true;
}
}
}
return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 1, 2, 2, 4 };
		System.out.println(tarGet(arr1));
	}

}
