package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinAvgTwoSliceTest {

    final private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    void findIndexOfSimpleArrayTest() {
        final int[] inputArray = new int[]{4, 2, 2, 5, 1, 5, 8};
        int index = minAvgTwoSlice.findIndexMinimalAverage(inputArray);
        Assertions.assertEquals(1, index);
    }

    @Test
    void findIndexOfSmallArrayTest() {
        final int[] inputArray = new int[]{4, 2};
        int index = minAvgTwoSlice.findIndexMinimalAverage(inputArray);
        Assertions.assertEquals(0, index);
    }

    @Test
    void findIndexLastElementsTest() {
        final int[] inputArray = new int[]{5, 5, 5, 5, 5, 1, 1};
        int index = minAvgTwoSlice.findIndexMinimalAverage(inputArray);
        Assertions.assertEquals(5, index);
    }
}
