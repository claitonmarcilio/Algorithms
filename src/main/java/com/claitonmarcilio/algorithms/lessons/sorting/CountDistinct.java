package com.claitonmarcilio.algorithms.lessons.sorting;

import java.util.Arrays;

public class CountDistinct {

    /**
     * Counts the number of distinct values in array
     *
     * @param values array of values
     * @return the number of distinct values
     */
    public int countDistinc(int[] values) {
        if (values.length == 0) {
            return 0;
        }
        Arrays.sort(values);
        int distincts = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                distincts++;
            }
        }
        return distincts;
    }
}
