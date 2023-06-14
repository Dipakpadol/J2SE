package com.BasicPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234; int revNum=0;
		System.out.println("Original Number is : "+num);
		while(num!=0) {
			revNum=revNum*10+num%10;
			num=num/10;
			
		}
		System.out.println("The Reverse Number is : "+revNum);
		
	}
}