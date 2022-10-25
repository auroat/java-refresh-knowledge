package com.github.auroat.javarefreshknowledge.algorithm;

public class PivotIndex {
    /**
     * Time Complexity: O(n), where n is the length of nums.
     * Space Complexity: O(1), the space used by leftsum and S.
     */
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x : nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
