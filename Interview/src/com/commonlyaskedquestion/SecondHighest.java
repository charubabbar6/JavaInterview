/*10. Find Second Highest number in an unsorted array*/
package com.commonlyaskedquestion;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4, 5, 2, 1, 9, 7};
		// Step 1: Initialize minValue to the largest possible int value
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
     // Step 2: Iterate through the array
        for (int number : arr) {
        	// Step 3: Compare each number with minValue
        	if (number > highest) {
        		// Step 4: Update minValue if the current number is smaller
        		secondHighest=highest;
        		highest = number;
        		
            }else if(number > secondHighest)
            {
            	secondHighest = number;
            }
        }
     // Step 5: Print the minimum value found
        System.out.println("Highest:: " + highest + "\nsecond highest::" + 
                secondHighest);
	}

}
