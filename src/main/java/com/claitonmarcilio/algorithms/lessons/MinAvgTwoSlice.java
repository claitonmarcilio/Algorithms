package com.claitonmarcilio.algorithms.lessons;

public class MinAvgTwoSlice {

    /**
     * Splits the array in slices of 2 and 3 elements and find the initial index of slice with smaller average
     *
     * @param inputArray array of int values
     * @return initial index of slice with smaller average
     */
    public int findIndexMinimalAverage(int[] inputArray) {
        int inputSize = inputArray.length;

        if (inputSize == 2) {
            return 0;
        }

        double minAvg = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < inputSize - 2; i++) {
            int sumSlice = inputArray[i];
            for (int subArraySize = 2; subArraySize <= 3; subArraySize++) {
                sumSlice = sumSlice + inputArray[i + subArraySize - 1];
                double avgSlice = sumSlice / (double) subArraySize;
                if (avgSlice < minAvg) {
                    minAvg = avgSlice;
                    minIndex = i;
                }
            }
        }

        int sumFinalSlice = inputArray[inputSize - 2] + inputArray[inputSize - 1];
        double avgFinalSlice = sumFinalSlice / 2d;
        if (avgFinalSlice < minAvg) {
            return inputSize - 2;
        }

        return minIndex;
    }
}
