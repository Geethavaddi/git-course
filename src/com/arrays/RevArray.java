package com.arrays;

import java.util.Arrays;

public class RevArray {
//	public static void arrayRev(int[] arr) {
//		int[] temp=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			temp[i]=arr[arr.length-1-i];
//			
//		}for(int i=0;i<arr.length;i++) {
//			arr[i]=temp[i];
//
//		}
//	}
			
		
	// 
		public static void method2(int[] x) {
			int s=0;
	        int e=x.length-1;
	        while(e>s) {
	        	int t=x[s];
	        	x[s]=x[e];
	        	x[e]=t;
	        	s++;
	        	e--;
	        }
		}
	

	public static void main(String[] args) {
		int[]  n=new int[] {1,2,3,4};
//		arrayRev(n);
		method2(n);
		System.out.println(Arrays.toString(n));
		

	}

}
