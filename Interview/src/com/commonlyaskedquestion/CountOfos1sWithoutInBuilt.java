/*3. Count the no of 1’s without using any inbuilt function.*/
package com.commonlyaskedquestion;

public class CountOfos1sWithoutInBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1, 1, 0, 1, 0, 1, 1, 0};
		int sum = 0;
		  for (int i : arr) {
	            sum += i;
	        }
		  System.out.println("count of 1's::" + sum);
		  System.out.println("count of 0's::" + (arr.length - sum));
	}

}
