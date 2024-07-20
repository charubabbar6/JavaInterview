/*6. Fibonacci of a number

The Fibonacci sequence is the series of numbers where each number is the sum of the two preceding numbers

Using this numbering, the Fibonacci sequence can be defined by the following three equations:

F0 = 0 (applies only to the first integer)
F1 = 1 (applies only to the second integer)
Fn = Fn-1 + Fn-2 (applies to all other integers)*/
package com.commonlyaskedquestion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //iterative way
        int num = 5;
        int n1;
        int n2 = 0, n3 = 1;
        System.out.println("Fibonaci series using iteration::");
        for (int i = 0; i < num; i++) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            System.out.println("\nFibonaci series using recursion::");
            for (int j = 0; j < num; j++) {
                System.out.print(fibonaci(j) + " ");
            }
        }
	}

	private static int fibonaci(int num) {
		// TODO Auto-generated method stub
		if (num < 0) return 0;
        if (num == 1 || num == 2) return 1;
        else
            return fibonaci(num - 2) + fibonaci(num - 1);
	}

}
