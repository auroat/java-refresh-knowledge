package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    @Test
    void romanToInteger() {
        String source = "LVIII";
        int output = 58;
        Assertions.assertEquals(output, RomanToInteger.romanToInt(source),
                "The output should be: " + output);

        source = "MCMXCIV";
        output = 1994;
        Assertions.assertEquals(output, RomanToInteger.romanToInt(source),
                "The output should be: " + output);

        source = "MMMCMXCIX";
        output = 3999;
        Assertions.assertEquals(output, RomanToInteger.romanToInt(source),
                "The output should be: " + output);
    }
}
