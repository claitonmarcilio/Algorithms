package com.claitonmarcilio.algorithms.lessons;

import java.util.Arrays;

public class MissingInteger {

    /**
     * Find the smallest positive integer that does not occur in a given set of values
     *
     * @param values set of values to be evaluated
     * @return the smallest positive integer missing
     */
    public int findMissingInteger(int[] values) {
        Arrays.sort(values);
        int min = 1;
        for (int value : values) {
            if (value > 0) {
                if (min - value == 0) {
                    min++;
                } else if (min - value < 0) {
                    return min;
                }
            }
        }
        return min;
    }

    /**
     * Find a missing element on a permutation
     *
     * @param values values in a sequence
     * @return missing element of permutation
     */
    public int findMissingOnPermutation(int[] values) {
        return (int) (getExpectedSum(values) - getCurrentSum(values));
    }

    private long getCurrentSum(int[] values) {
        long currentSum = 0;
        for (int i : values) {
            currentSum += i;
        }
        return currentSum;
    }

    private long getExpectedSum(int[] values) {
        int expectedSize = values.length + 1;
        return (long) expectedSize * ((long) expectedSize + 1) / 2;
    }
}
