package com.github.auroat.javarefreshknowledge.algorithm;

public class PalindromeNumber {
    /**
     * Time complexity: O(log10(n)), because we divide the input by 10 for every iteration.
     * Space complexity: O(1)
     */
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}

