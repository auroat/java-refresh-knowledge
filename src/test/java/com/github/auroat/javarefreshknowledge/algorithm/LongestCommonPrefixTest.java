package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        String result = "abe";
        String[] input = {"abegale", "abecedar", "abese"};

        Assertions.assertEquals(result, LongestCommonPrefix.longestCommonPrefix(input),
                "'abe' should be the longest common prefix.");
    }

    @Test
    void longestCommonPrefix_none() {
        String result = "";
        String[] input = {"bbegale", "cabecedar", "wabese"};

        Assertions.assertEquals(result, LongestCommonPrefix.longestCommonPrefix(input),
                "There should NOT be a common prefix.");
    }
}
