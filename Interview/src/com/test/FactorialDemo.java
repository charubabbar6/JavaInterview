package com.test;

public class FactorialDemo {
	public static int factorial(int number)
	{
		int result=1;
	for(int i=number;i>=1;i--)
	{
		result=result*i;
	}
		return result;
		
	}
	public static int recursiveFactorial(int number)
	{
		if(number==0)
		{
			return 1;
		}else
		{
			return (number*recursiveFactorial(number-1));
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.println("fact"+factorial(num));
		System.out.println("fact"+recursiveFactorial(num));
	}

}
