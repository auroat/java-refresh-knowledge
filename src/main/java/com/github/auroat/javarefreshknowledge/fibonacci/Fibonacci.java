package com.github.auroat.javarefreshknowledge.fibonacci;

public class Fibonacci {
    static int[] fibonacciSequenceOfLengthSeven() {
        return new int[]{0, 1, 1, 2, 3, 5, 8};
    }

    static int[] fibonacciSequenceByLimit(Integer limit) {
        if (limit == null || limit == 0) {
            return null;
        }

        int[] result = new int[limit];
        if (limit < 2) {
            return result;
        }

        Tuple<Integer, Integer> latestFibonacciPair = new Tuple<>(0, 1);
        result[0] = latestFibonacciPair.getFibonacciOne();
        result[1] = latestFibonacciPair.getFibonacciTwo();

        for (int i = 2; i < limit; i++) {
            int currentFibonacciOne = latestFibonacciPair.getFibonacciOne();
            int currentFibonacciTwo = latestFibonacciPair.getFibonacciTwo();

            latestFibonacciPair.setFibonacciOne(currentFibonacciOne + currentFibonacciTwo);
            latestFibonacciPair.setFibonacciTwo(latestFibonacciPair.getFibonacciOne() + currentFibonacciTwo);

            result[i] = latestFibonacciPair.getFibonacciOne();
            if (i + 1 < limit) {
                result[i + 1] = latestFibonacciPair.getFibonacciTwo();
            }

            i++;
        }

        return result;
    }
}

class Tuple<FibonacciOne, FibonacciTwo> {
    private FibonacciOne fibonacciOne;
    private FibonacciTwo fibonacciTwo;

    public Tuple(FibonacciOne fibonacciOne, FibonacciTwo fibonacciTwo) {
        this.fibonacciOne = fibonacciOne;
        this.fibonacciTwo = fibonacciTwo;
    }

    public FibonacciOne getFibonacciOne() {
        return fibonacciOne;
    }

    public void setFibonacciOne(FibonacciOne fibonacciOne) {
        this.fibonacciOne = fibonacciOne;
    }

    public FibonacciTwo getFibonacciTwo() {
        return fibonacciTwo;
    }

    public void setFibonacciTwo(FibonacciTwo fibonacciTwo) {
        this.fibonacciTwo = fibonacciTwo;
    }
}