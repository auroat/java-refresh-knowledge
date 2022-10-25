package com.github.auroat.javarefreshknowledge.algorithm;

public class StringIsSubsequence {

    /**
     * Let ∣S∣ be the length of the source string, and |T| be the length of the target string.
     *
     * Time Complexity: O(|T|)
     * Space Complexity: O(1)
     *
     * In this iteration, a constant memory is consumed regardless of the input.
     */
    public static boolean isSubsequence(String s, String t) {
        int leftBound = s.length(), rightBound = t.length();
        int pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // Move both pointers or just the right pointer.
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft += 1;
            }
            pRight += 1;
        }
        return pLeft == leftBound;
    }
}
