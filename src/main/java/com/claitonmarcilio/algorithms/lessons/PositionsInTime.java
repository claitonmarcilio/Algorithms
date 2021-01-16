package com.claitonmarcilio.algorithms.lessons;

import java.util.Arrays;

public class PositionsInTime {

    /**
     * Returns the earliest time that all positions are filled to a final position
     *
     * @param finalPosition
     * @param positionsInTime
     * @return
     */
    public int findEarliestTimeForPositions(int finalPosition, int[] positionsInTime) {
        int[] positions = new int[finalPosition];
        Arrays.fill(positions, -1);

        for (int time = 0; time < positionsInTime.length; time++) {
            int positionValue = positionsInTime[time];
            int positionIndex = positionValue - 1;
            int currentTime = positions[positionIndex];
            if (currentTime == -1) {
                positions[positionIndex] = time;
            }
        }

        int minTime = 0;
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] == -1) {
                return -1;
            }
            if (positions[i] > minTime) {
                minTime = positions[i];
            }

        }

        return minTime;
    }
}
