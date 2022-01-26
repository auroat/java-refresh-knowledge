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
    void testGenerateBasicFibonacciSequence() {
        int[] result = Fibonacci.fibonacciSequenceOfLengthSeven();
        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8};

        Assertions.assertArrayEquals(expectedResult, result, "The two sequences should match.");
    }
}
