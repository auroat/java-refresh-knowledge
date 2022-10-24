package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningSumTest {
    @Test
    void runningSum() {
        int[] input = {3, 1, 2, 10, 1};
        int[] expectedResult = {3, 4, 6, 16, 17};

        Assertions.assertArrayEquals(expectedResult, RunningSum.runningSum(input), "The two arrays should match.");
    }
}
