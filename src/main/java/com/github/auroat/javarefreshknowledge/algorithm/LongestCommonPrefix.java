package com.github.auroat.javarefreshknowledge.algorithm;

public class LongestCommonPrefix {

    /**
     * Time complexity : O(S), where S is the sum of all characters in all strings.
     * <p>
     * In the worst case all n strings are the same. The algorithm compares the string S1 with the other strings [S2...Sn].
     * There are S character comparisons, where S is the sum of all characters in the input array.
     * <p>
     * Space complexity: O(1). We only used constant extra space.
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
