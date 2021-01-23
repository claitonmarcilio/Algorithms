package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayEquilibriumTest {

    private final ArrayEquilibrium arrayEquilibrium = new ArrayEquilibrium();

    @Test
    void findMinDiffOnSplitTest() {
        int[] values = new int[]{3, 1, 2, 4, 3};

        int minDiff = arrayEquilibrium.findMinDiffOnSplit(values);

        assertEquals(1, minDiff);
    }

}