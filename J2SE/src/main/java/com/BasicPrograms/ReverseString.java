package com.BasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="Dipak";
		System.out.println("Original String is "+s);
		
		char[] ch=s.toCharArray(); //Convert string to charArray 
		
		System.out.println("The Reverse String is ");
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}

}
