package com.github.auroat.javarefreshknowledge.algorithm;

import java.util.Arrays;

public class IsomorphicStrings {

    /**
     * Here n is the length of each string (if the strings are not the same length, then they cannot be isomorphic).
     *
     * Time Complexity: O(n). We process each character in both strings exactly once to determine
     * if the strings are isomorphic.
     *
     * Space Complexity: O(1) since the size of the ASCII character set is fixed and the keys in our dictionary
     * are all valid ASCII characters according to the problem statement.
     */
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, -1);

        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);

        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }

            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }

        return true;
    }
}
