package com.LambdaExpression;

interface I3{
	public int squareIt(int n);
}

class Test implements I3{
	public int squareIt(int n) {
		return n*n;
	}
}

public class ExampleThree {

	public static void main(String[] args) {
		
	I3 obj3=new Test();
	System.out.println("The squareOf 4 is : "+obj3.squareIt(4));
	
	I3 obj4= n->  n*n; 
	System.out.println("The squareof 5 is : "+obj4.squareIt(5));

	}

}
