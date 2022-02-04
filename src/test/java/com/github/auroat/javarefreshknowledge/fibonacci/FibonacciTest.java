package com.github.auroat.javarefreshknowledge.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @BeforeAll
    static void setup() {
        System.out.println("[INFO] @BeforeAll executed.");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("[INFO] @BeforeEach executed.");
    }

    @Tag("DEV")
    @Test
    void generateBasicFibonacciSequence() {
        int[] result = Fibonacci.fibonacciSequenceOfLengthSeven();
        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8};

        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");
    }

    @Test
    void fibonacciSequenceByLimit() {
        // Test with limit 1.
        int[] result = Fibonacci.fibonacciSequenceByLimit(1);
        int[] expectedResult = {0};
        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");

        // Test with limit 10.
        result = Fibonacci.fibonacciSequenceByLimit(10);
        expectedResult = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");

        // Test with limit 7.
        result = Fibonacci.fibonacciSequenceByLimit(7);
        expectedResult = new int[]{0, 1, 1, 2, 3, 5, 8};
        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");

        // Test with limit 0.
        result = Fibonacci.fibonacciSequenceByLimit(0);
        expectedResult = null;
        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");

        // Test with limit NULL.
        result = Fibonacci.fibonacciSequenceByLimit(null);
        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");
    }
}
