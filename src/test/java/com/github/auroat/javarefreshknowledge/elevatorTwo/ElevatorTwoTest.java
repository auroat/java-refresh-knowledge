package com.github.auroat.javarefreshknowledge.elevatorTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElevatorTwoTest {
    @Test
    public void testCase1() {
        int[][] grid = {{0, 1, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 1, 0}};
        Assertions.assertEquals(1, new ElevatorTwo().findMinimumDistance(2, grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {{1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Assertions.assertEquals(3, new ElevatorTwo().findMinimumDistance(3, grid));
        Assertions.assertEquals(0, new ElevatorTwo().findMinimumDistance(0, grid));

    }

    @Test
    public void testCase3() {
        int[][] grid = {{1, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        Assertions.assertEquals(1, new ElevatorTwo().findMinimumDistance(3, grid));
        Assertions.assertEquals(0, new ElevatorTwo().findMinimumDistance(2, grid));
    }

    @Test
    public void testCase4() {
        int[][] grid = {{1, 1, 0, 1, 1}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        Assertions.assertEquals(3, new ElevatorTwo().findMinimumDistance(4, grid));
    }
}
