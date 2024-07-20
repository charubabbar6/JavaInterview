package com.test.stringproblem;

public class StringReverser {

	
	public static String reverse(String input)
		{
		String result="";
		for(int i=input.length()-1;i>=0;i--)
		{
			result=result+input.charAt(i);
		}
			return result;
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StringBuffer("abc").reverse();
		System.out.println(reverse("abc"));
}
}