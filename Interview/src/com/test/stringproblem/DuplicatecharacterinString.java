package com.test.stringproblem;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatecharacterinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("findDuplicatesUsingFor::::"+findDuplicatesUsingFor("code decode"));//time complexity= o(N2)
		System.out.println("findDuplicatesUsingArrays::"+findDuplicatesUsingArrays("code decode"));//time complexity= o(N) ,Space Complexity =o(256)
		System.out.println("findDuplicatesUsingMap::"+findDuplicatesUsingMap("code decode"));//time complexity= o(N log N)
	}
	
	 
	private static Set<Character> findDuplicatesUsingMap(String name) {
		// TODO Auto-generated method stub
		Set<Character> duplicates=new LinkedHashSet<Character>();
		HashMap<Character, Integer> countMap= new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++)//o(n)
		{
			if(countMap.containsKey(name.charAt(i)))//d
			{
				countMap.put(name.charAt(i), countMap.get(name.charAt(i))+1);//d,3 ,e,3 o(logn)
			}else
			{
				countMap.put(name.charAt(i), 1);//code
			}
		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet())
		{
			if(entry.getValue() > 1)
				duplicates.add(entry.getKey());
		}
		return duplicates;
	}


	private static Set<Character> findDuplicatesUsingArrays(String name) {//o(2n)
		Set<Character> duplicates=new LinkedHashSet<Character>();
		int[] arrayForChar=new int[256];
		for(int i=0;i<name.length();i++)//o(n)
		{
			arrayForChar[name.charAt(i)]=arrayForChar[name.charAt(i)]+1;
		}
		for(int i=0;i<256;i++)//due to ascii value always return value in ascending order.//o(n)
		{
			if(arrayForChar[i]>1)
			{
				duplicates.add((char)i);
			}
		}
		return duplicates;//o(2n)~~o(n)
	}


	private static Set<Character> findDuplicatesUsingFor(String name) {//o(n^2)
		Set<Character> duplicates=new LinkedHashSet<Character>();//if print in insertion order
		//Set<Character> duplicates=new HashSet<Character>(); //if print in ascending order
		for(int i=0;i<name.length();i++)//o(n)
		{
			for(int j=i+1;j<name.length();j++)//o(n)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					duplicates.add(name.charAt(j));
				}
			}
		}
		return duplicates;
		
		
	}

}
