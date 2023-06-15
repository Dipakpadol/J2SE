package com.Practice;

public class MinMaxNumber {

	public static void main(String[] args) {
		
		int[] numbers = {5, 2, 9, 1, 7};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > smallest) {
                smallest = numbers[i];
            } else if (numbers[i] < largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

	}

}
