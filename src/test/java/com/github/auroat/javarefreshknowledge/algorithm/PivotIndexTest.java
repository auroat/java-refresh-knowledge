package com.github.auroat.javarefreshknowledge.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PivotIndexTest {
    @Test
    void pivotIndex_centerPivot() {
        int[] input = {2, 6, 5, 9, 7, 2, 4};
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, PivotIndex.pivotIndex(input), "The two ints should match.");
    }

    @Test
    void pivotIndex_noResult() {
        int[] input = {2, 6, 5, 9, 7, 2, 1};
        int expectedResult = -1;

        Assertions.assertEquals(expectedResult, PivotIndex.pivotIndex(input), "The two ints should match.");
    }

    @Test
    void pivotIndex_resultIsZero() {
        int[] input = {5, 2, -2};
        int expectedResult = 0;

        Assertions.assertEquals(expectedResult, PivotIndex.pivotIndex(input), "The two ints should match.");
    }
}
