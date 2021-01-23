package com.claitonmarcilio.algorithms.lessons;

public class ArrayEquilibrium {

    /**
     * Returns the minimal difference that can be achieved splitting an array in two parts
     *
     * @param values Array of values
     * @return the minimal difference that can be achieved
     */
    public int findMinDiffOnSplit(int[] values) {
        long sum = getSum(values);
        long minDiff = sum;
        long firstPart = 0;

        for (int i = 0; i < values.length - 1; i++) {
            int value = values[i];
            firstPart += value;
            long secondPart = sum - firstPart;
            minDiff = Math.min(minDiff, Math.abs(secondPart - firstPart));
        }

        return (int) minDiff;
    }

    private long getSum(int[] values) {
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
