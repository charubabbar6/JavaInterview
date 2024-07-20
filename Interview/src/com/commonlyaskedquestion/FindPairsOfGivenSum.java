/*12 . Find all pairs equal to a given sum*/
package com.commonlyaskedquestion;

import java.util.HashMap;
import java.util.Map;

public class FindPairsOfGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{15, 12, 4, 16, 9, 8, 24, 0};
        int sum = 24;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (map.containsKey(sum - nums[i])) {
                System.out.println("pair found::" + (sum - nums[i]) + " " + nums[i]);
            }
            map.put(nums[i], i);
        }
	}

}
