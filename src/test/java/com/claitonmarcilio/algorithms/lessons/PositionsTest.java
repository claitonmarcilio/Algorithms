package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionsTest {

    private Positions positions = new Positions();

    @Test
    void findEarliestTimeForPositionTest() {
        int[] positionsInTime = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        int minTime = positions.findEarliestTimeForPositions(5, positionsInTime);

        assertEquals(6, minTime);
    }

    @Test
    void unreachablePositionTest() {
        int[] positionsInTime = new int[]{1, 3, 1, 4, 2, 3, 5, 4};

        int minTime = positions.findEarliestTimeForPositions(6, positionsInTime);

        assertEquals(-1, minTime);
    }

    @Test
    void numberOfStepsToTargetTest() {
        assertEquals(3, positions.numberOfStepsToTarget(10, 85, 30));
    }

}