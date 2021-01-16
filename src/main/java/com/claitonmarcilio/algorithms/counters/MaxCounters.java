package com.claitonmarcilio.algorithms.counters;

public class MaxCounters {

    /**
     *  Evaluate two possible operations to an array of int values:
     *  - increase counter by 1, if value is less than or equal to "numberOfCounters" param
     *  - set all counters to maximum value of counters, if value is equal to "numberOfCounters" param + 1
     *
     * @param numberOfCounters
     * @param inputValues
     * @return
     */
    public int[] evaluateCounters(int numberOfCounters, int[] inputValues) {
        final int setMaxOperation = numberOfCounters + 1;
        int [] counters = new int [numberOfCounters];
        int currentMax = 0;
        int max = 0;
        for (int inputValue : inputValues) {
            if (inputValue == setMaxOperation) {
                max = currentMax;
            } else {
                int index = inputValue - 1;
                counters[index] = Math.max(max, counters[index]) + 1;
                currentMax = Math.max(currentMax, counters[index]);
            }
        }
        for (int i = 0; i < numberOfCounters; i++) {
            counters[i] = Math.max(counters[i], max);
        }

        return counters;
    }
}
