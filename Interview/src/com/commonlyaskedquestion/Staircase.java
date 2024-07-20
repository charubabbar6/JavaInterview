/*4. Count the no of ways to reach the nth stair.

There are n stairs, a person standing at the bottom wants to climb stairs to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time, the task is to count the number of ways that a person can reach at the top.
*/
package com.commonlyaskedquestion;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;  // Example value, you can change it to test with other values
	        System.out.println("Number of ways to reach the " + n + "th stair is: " + countWays(n));
	}

	private static int countWays(int n) {
		// TODO Auto-generated method stub
		
		// Base cases
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        
        // Initialize an array to store the number of ways to reach each stair
        int[] dp = new int[n + 1];
        dp[0] = 1;  // 1 way to stay at the ground (do nothing)
        dp[1] = 1;  // 1 way to reach the first stair
        
     // Fill the dp array using the recurrence relation
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
		return dp[n];
	}

}
