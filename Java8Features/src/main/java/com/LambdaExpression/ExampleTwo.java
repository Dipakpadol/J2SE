package com.LambdaExpression;

interface I2{
	public void add(int a, int b); 
}
class Demo2 implements I2{
	public void add(int a, int b)
	{
		System.out.println("The sum is : "+(a+b));
	}
}
public class ExampleTwo {

	public static void main(String[] args) {
		I2 obj=new Demo2();
		obj.add(10,20);
		
		I2 obj1= ( a,b )->System.out.println("The sum is : "+(a+b));
		obj1.add(20, 30);

	}

}
