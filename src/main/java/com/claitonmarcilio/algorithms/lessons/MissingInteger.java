package com.claitonmarcilio.algorithms.lessons;

import java.util.Arrays;

public class MissingInteger {

    /**
     * Find the smallest positive integer that does not occur in a given sequence
     *
     * @param values
     * @return
     */
    public int findMissingInteger(int[] values) {
        Arrays.sort(values);
        int min = 1;
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
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
}
