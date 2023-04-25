package com.Practice;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Original Number : ");
		int number=sc.nextInt();
		int reverse=0;

		while(number !=0) {
			reverse=reverse*10+number%10;
			number=number/10;
			
		}
		System.out.println("The Reverse Number : "+reverse);
	}

}
