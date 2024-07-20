package com.commonlyaskedquestion;

public class FindMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10, 20, -5, 3, -15, 7 };
		/*
		 * When finding the minimum value in an array, Integer.MAX_VALUE is used as the
		 * initial value to ensure any value in the array will be smaller.
		 */
        int maxValue = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        System.out.println("The maximum value in the array is: " + maxValue);
	}

}
