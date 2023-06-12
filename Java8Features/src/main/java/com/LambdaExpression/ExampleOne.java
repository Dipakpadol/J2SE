package com.LambdaExpression;

interface I1{
	public void m1();
}
class Demo implements I1{
	public void m1() {
		System.out.println("Hello with normal way");
	}
}

public class ExampleOne {

	public static void main(String[] args) {
	I1 obj1=new Demo();
	obj1.m1();
		
	 I1 obj= ()-> System.out.println("hello with  Lambda Expresssion");
		obj.m1();

	}

}
