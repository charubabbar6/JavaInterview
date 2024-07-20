package com.test.stringproblem;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String input)
	{
		if(input==null)
		{
			throw new IllegalArgumentException("Input cannot be null");
		}
		StringBuilder sb=new StringBuilder(input);
		StringBuilder reversesb=sb.reverse();
		return reversesb.toString().equalsIgnoreCase(input);
		/*
		 * String result=""; for(int i=input.length();i>=0;i--) { result=result+input; }
		 * if(input.compareTo(result)==0) { return true; }else { return false; }
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome("Step on no pets"));
System.out.println("........................");
System.out.println(isPalindrome("malylam"));
	}

}
