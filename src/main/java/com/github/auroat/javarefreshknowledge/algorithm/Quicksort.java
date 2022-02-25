package com.github.auroat.javarefreshknowledge.algorithm;

/**
 * Given an unsorted array of numbers, find Kth smallest number in it.
 * <p>
 * Please note that it is the Kth smallest number in the sorted order, not the Kth distinct element.
 *
 * Solution Breakdown:
 *
 * Time Complexity: average O(N)O(N) or worst case O(N^2)
 *
 * We use Quicksort’s partitioning scheme to find the Kth smallest number. We recursively partition the input array and if,
 * after partitioning, our pivot is at the K-1 index we have found our required number. If not, we choose one of the following options:
 *
 * If pivot’s position is larger than K-1, we recursively partition the array on numbers lower than the pivot.
 * If pivot’s position is smaller than K-1, we recursively partition the array on numbers greater than the pivot.
 */

class Quicksort {
    public static int findKthSmallestNumber(int[] nums, int k) {
        return findKthSmallestNumberRec(nums, k, 0, nums.length - 1);
    }

    public static int findKthSmallestNumberRec(int[] nums, int k, int start, int end) {
        int p = partition(nums, start, end);

        if (p == k - 1)
            return nums[p];

        if (p > k - 1) // search lower part
            return findKthSmallestNumberRec(nums, k, start, p - 1);

        // search higher part
        return findKthSmallestNumberRec(nums, k, p + 1, end);
    }

    private static int partition(int[] nums, int low, int high) {
        if (low == high)
            return low;

        int pivot = nums[high];
        for (int i = low; i < high; i++) {
            // all elements less than 'pivot' will be before the index 'low'
            if (nums[i] < pivot)
                swap(nums, low++, i);
        }
        // put the pivot in its correct place
        swap(nums, low, high);
        return low;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int result = Quicksort.findKthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 3);
        System.out.println("Kth smallest number is: " + result);

        // since there are two 5s in the input array, our 3rd and 4th smallest numbers should be a '5'
        result = Quicksort.findKthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 4);
        System.out.println("Kth smallest number is: " + result);

        result = Quicksort.findKthSmallestNumber(new int[]{5, 12, 11, -1, 12}, 3);
        System.out.println("Kth smallest number is: " + result);
    }
}