package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {
    @Test
    void isIsomorphic_true() {
        String stringOne = "titles";
        String stringTwo = "papers";

        Assertions.assertTrue(IsomorphicStrings.isIsomorphic(stringOne, stringTwo),
                "The two strings should be isomorphic.");
    }

    @Test
    void isIsomorphic_false() {
        String stringOne = "cloud";
        String stringTwo = "premise";

        Assertions.assertFalse(IsomorphicStrings.isIsomorphic(stringOne, stringTwo),
                "The two strings should NOT be isomorphic.");
    }
}
