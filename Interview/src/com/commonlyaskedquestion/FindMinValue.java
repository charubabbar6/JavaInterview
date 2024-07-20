package com.commonlyaskedquestion;

public class FindMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = { 10, 20, -5, 3, -15, 7 };
			/*
			 * Integer.MIN_VALUE as a Constant:
			 * 
			 * It provides a convenient way to reference the smallest possible int value in
			 * Java. It is particularly useful for initializing variables in algorithms that
			 * find maximum or minimum values, ensuring that any value found will be larger
			 * or smaller than the initial value.
			 */
	        int minValue = Integer.MAX_VALUE;

	        for (int number : numbers) {
	            if (number < minValue) {
	                minValue = number;
	            }
	        }

	        System.out.println("The minimum value in the array is: " + minValue);
	}

}
