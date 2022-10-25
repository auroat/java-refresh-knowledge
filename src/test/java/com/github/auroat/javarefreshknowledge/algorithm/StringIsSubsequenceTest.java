package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringIsSubsequenceTest {
    @Test
    void isSubsequence_true() {
        String source = "abc";
        String target = "eawqbercj";

        Assertions.assertTrue(StringIsSubsequence.isSubsequence(source, target),
                "The source string should be a subsequence.");
    }

    @Test
    void isSubsequence_false() {
        String source = "abc";
        String target = "ewqbercja";

        Assertions.assertFalse(StringIsSubsequence.isSubsequence(source, target),
                "The source string should NOT be a subsequence.");
    }
}
