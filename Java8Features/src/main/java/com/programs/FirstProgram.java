package com.programs;

import java.util.function.Function;

public class FirstProgram {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;{
			System.out.println("The SqureOf 6 is : "+f.apply(6));
			
		}
	   
	   
	}

}
