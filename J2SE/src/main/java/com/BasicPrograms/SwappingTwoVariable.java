package com.BasicPrograms;

public class SwappingTwoVariable {

	public static void main(String[] args) {
		int a=10; int b=20;
		System.out.println("Befor swapping a is "+a);
		System.out.println("Before swapping b is "+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("\n"+"After swapping a is "+a);
		 System.out.println("After Swapping b is "+b);

	}

}
