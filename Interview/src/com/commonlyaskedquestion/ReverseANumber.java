/*9. Reverse a number*/
package com.commonlyaskedquestion;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=789;
        int reverse = 0;
        System.out.println("Before Reversal of a number::"+ num);
        while (num !=0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("After Reversal of a number::"+ reverse);
	}

}
