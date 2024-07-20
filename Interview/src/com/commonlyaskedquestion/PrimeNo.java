/*Prime no generation between 2 numbers.

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. In other words, a prime number is a number that is divisible only by 1 and itself, and has no other factors.

For example, 2, 3, 5, 7, 11, 13, 17, 19, 23, and so on, are prime numbers because they cannot be divided evenly by any other numbers except 1 and themselves.
*/
package com.commonlyaskedquestion;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 2;
        int second = 20;
		/*
		 * for (int i = first; i < second; i++) { boolean value = isPrime(i); if (value)
		 * System.out.println("Prime no::" + i);
		 * 
		 * }
		 */
        
        System.out.println("Prime numbers between " + first + " and " + second + ":");
        for (int i = first; i <= second; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
	}

	private static boolean isPrime(int num) {
		
		// TODO Auto-generated method stub
		/*if (num <= 1)
		return false;
		for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
	}*/
		if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 is the only even prime number
        }
        if (num % 2 == 0) {
            return false; // other even numbers are not primes
        }
        // Check up to the square root of num
		/*
		 * Instead of checking all numbers up to num - 1, we only check up to the square
		 * root of num. This is because if num is divisible by a number greater than its
		 * square root, it will also be divisible by a number smaller than its square
		 * root.
		 */
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
		return true;
}
}
