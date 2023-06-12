package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(40);
		l.add(30);
		l.add(70);
		l.add(50);
		
		System.out.println(l);
		
		Comparator<Integer> c= (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println("Ascending Sorting Order : "+l);
		
		Comparator<Integer> c1=(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;
		Collections.sort(l,c1);
		System.out.println("Descending Sorting Order : "+l);
		
		
		

	}

}
