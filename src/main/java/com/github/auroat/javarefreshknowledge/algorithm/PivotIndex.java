package com.github.auroat.javarefreshknowledge.algorithm;

public class PivotIndex {
    /**
     * Time Complexity: O(n), where n is the length of nums.
     * Space Complexity: O(1), the space used by leftSum and sum.
     */
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for (int x : nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
