package com.claitonmarcilio.algorithms.lessons;

import java.util.Arrays;

public class Positions {

    /**
     * Returns the earliest time that all positions are filled to a final position
     *
     * @param finalPosition   position to be reached
     * @param positionsInTime array of values representing positions in time
     * @return the earliest time that all positions are filled
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
        for (int position : positions) {
            if (position == -1) {
                return -1;
            }
            if (position > minTime) {
                minTime = position;
            }

        }

        return minTime;
    }

    /**
     * Calculates the number of steps necessary to reach a target
     *
     * @param initialPosition the initial position
     * @param target          the final position
     * @param stepSize        the step size
     * @return the number of steps
     */
    public int numberOfStepsToTarget(int initialPosition, int target, int stepSize) {
        return (int) Math.ceil(((double) target - (double) initialPosition) / stepSize);
    }
}
