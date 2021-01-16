package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountersTest {

    private final MaxCounters maxCounters = new MaxCounters();

    @Test
    void maxCountersTest() {
        int[] inputValues = new int[]{3, 4, 4, 6, 1, 4, 4};
        int numberOfCounters = 5;

        int[] result = maxCounters.evaluateCounters(numberOfCounters, inputValues);

        int[] expected = new int[]{3, 2, 2, 4, 2};
        Assertions.assertArrayEquals(expected, result);
    }
}