package com.test.stringproblem;

import java.util.HashSet;

public class TargetFinder {
	
	public static boolean findNumbers(int[] arr,int targetNumber)
	{
		HashSet<Integer> processedNumbers=new HashSet<>();
		for (int i=0;i<arr.length;i++)
		{
			int requiredNumber=targetNumber-arr[i];
			if(processedNumbers.contains(requiredNumber))
			{
				System.out.println(requiredNumber);
				System.out.println(arr[i]);
				return true;
			}else
			{
				processedNumbers.add(arr[i]);
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[30,20,14,18,17] 32
		//any two number add and find result 14+18=32
		int target=32;
		int arr[]= {30,20,14,18,17};
		System.out.println(TargetFinder.findNumbers(arr,target));
	}

}
