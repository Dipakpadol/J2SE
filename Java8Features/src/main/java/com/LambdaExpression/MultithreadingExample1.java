package com.LambdaExpression;

public class MultithreadingExample1 {

	public static void main(String[] args) {
		Runnable r= ()-> System.out.println("Child-Thread");
		Thread t=new Thread(r);
		t.start();
		{
			System.out.println("Main-thread");
		}
          
	}

}
