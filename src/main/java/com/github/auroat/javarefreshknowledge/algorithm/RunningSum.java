package com.github.auroat.javarefreshknowledge.algorithm;

public class RunningSum {
    /**
     * Running Sum of 1d Array
     * Complexity Analysis
     *
     * Time complexity: O(n) where n is the length of input array.
     *
     * Space complexity: O(1) since we don't use any additional space to find the running sum.
     * Note that we do not take into consideration the space occupied by the output array.
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
