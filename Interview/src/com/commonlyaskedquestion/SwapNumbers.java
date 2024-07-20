/*13. Swap 2 numbers without using any inbuilt function*/
package com.commonlyaskedquestion;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
        int y = 5;
        System.out.println("Before swapping:"
                + " x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);
	}

}
