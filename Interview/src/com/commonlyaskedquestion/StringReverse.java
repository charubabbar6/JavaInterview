/*11. Reverse a string ( word or a sentence) iterative/recursive way.*/
package com.commonlyaskedquestion;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse a word
        String word = "Hello";
        for (int i = word.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(word.toCharArray()[i]);
        }
      //reverse a sentence
        String str = "Hello today is expiry";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i] + " ";
        }
        System.out.println("\n" + result);
        System.out.println("\nUsing recursion");
        reverse(word);
	}

	private static void reverse(String word) {
		// TODO Auto-generated method stub
		if ((word == null) || (word.length() <= 1))
            System.out.println(word);
        else {
            System.out.print(word.charAt(word.length() - 1));
            reverse(word.substring(0, word.length() - 1));
        }
	}

}
