//Prime Number is a Number It's divisible by 1 and itself.

package com.BasicPrograms;
public class PrimeOrNot {

	public static void main(String[] args) {
		int num=3; int count=0;
		
		if(num>1) {
			for(int i=1; i<=num; i++ ) {
				if(num%i==0) {
					count++;
				}
			}
				if(count==2) {
					System.out.println(num+" : Number is Prime");
				}
				else {
					System.out.println(num+" : Number is Not Prime");
				}
			
		}
		else {
			System.out.println(num+" : Number is Not prime");
		}
		

	}

}
