package com.Practice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.print("The Original Array : ");
		for(int i=0; i<a.length ;i++) {
			System.out.print(+a[i]);
			
		}
		System.out.println();
		
		System.out.print("The Reverse Array : ");
		for(int i=a.length-1 ;i>=0; i--) {
			System.out.print(+a[i]);
		}

	}
}
