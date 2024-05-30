package com.arrays;

import java.util.Arrays;

public class RotateArray {
//	public static int[] rot(int[] arr,int ele) {
//		int[] arr1=Arrays.copyOfRange(arr, arr.length-ele,arr.length);
//		System.out.println(Arrays.toString(arr1));
//		int[] arr2=Arrays.copyOfRange(arr,0, arr.length-ele);
//		System.out.println(Arrays.toString(arr2));
//		int[] narr=new int[arr.length];
//		for(int i=0;i<narr.length;i++) {
//			if(i>=arr1.length) {
//				narr[i]=arr2[i-(arr1.length)];
//			}
//			else 
//				narr[i]=arr1[i];
//			}
//			return narr;
//		}
	

public static void main(String[] args) {
		
int[] arr= {1,2,3,4,5,6,7};
//System.out.println(Arrays.toString(rot(arr,2)));
int n=3;
//for(int i=0;i<arr.length;i++) {
//	System.out.print(arr[i]);
//}
for(int i=0;i<n;i++) {
	int j,first;
	first=arr[0];
for(j=0;j<arr.length-1;j++) {

	arr[j]=arr[j+1];
	}
arr[j]=first;
	}
	System.out.println();
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}

}}
