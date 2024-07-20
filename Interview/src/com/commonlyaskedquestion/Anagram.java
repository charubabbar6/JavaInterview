package com.commonlyaskedquestion;

import java.util.Arrays;

/*1. Print if the strings are Anagram or not?
 * 
An anagram is a word or phrase that’s formed by rearranging the letters of another word or phrase.*/
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="own";
		String str2="now";
		char[] charray1=str1.toCharArray();
		char[] charray2=str2.toCharArray();
		Arrays.sort(charray1);
		Arrays.sort(charray2);
		System.out.println(Arrays.equals(charray1, charray2));
	}

}
