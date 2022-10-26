package com.github.auroat.javarefreshknowledge.algorithm;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    /**
     * Let n be the length of the input string (the total number of symbols in it).
     * <p>
     * Time complexity : O(1).
     * <p>
     * As there is a finite set of roman numerals, the maximum number possible can be 3999, which in roman
     * numerals is MMMCMXCIX. As such the time complexity is O(1).
     * <p>
     * If roman numerals had an arbitrary number of symbols, then the time complexity would be proportional
     * to the length of the input, i.e. O(n). This is assuming that looking up the value of each symbol is O(1).
     * <p>
     * Space complexity : O(1).
     * <p>
     * Because only a constant number of single-value variables are used, the space complexity is O(1).
     */
    public static int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }

            if (currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            } else {
                sum += currentValue;
                i += 1;
            }

        }
        return sum;
    }
}
