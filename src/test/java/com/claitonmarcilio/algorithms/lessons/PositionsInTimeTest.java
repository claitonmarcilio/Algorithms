package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionsInTimeTest {

    private PositionsInTime evaluator = new PositionsInTime();

    @Test
    void findEarliestTimeForPositionTest() {
        int[] positionsInTime = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        int minTime = evaluator.findEarliestTimeForPositions(5, positionsInTime);

        assertEquals(6, minTime);
    }

    @Test
    void unreachablePositionTest() {
        int[] positionsInTime = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        int minTime = evaluator.findEarliestTimeForPositions(6, positionsInTime);

        assertEquals(-1, minTime);
    }

}