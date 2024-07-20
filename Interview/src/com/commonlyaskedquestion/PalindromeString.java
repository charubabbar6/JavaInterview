/*Palindrome

A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards.

For example Madam , Mom etc.*/
package com.commonlyaskedquestion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "mom";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println("palindrome or not::" + reverse.equals(original));
	}

}
