package com.claitonmarcilio.algorithms.lessons;

public class PassingCarsCounter {

    private static final int EAST_DIRECTION = 0;
    private static final int WEST_DIRECTION = 1;
    private int maxPassingCars;

    public PassingCarsCounter(int maxPassingCars) {
        this.maxPassingCars = maxPassingCars;
    }

    /**
     * Count the number of pairs of passing cars on a road.
     *  - 0 represents a car traveling east.
     *  - 1 represents a car traveling west.
     *  A pair of car is passing when travelling in opposite directions.
     *
     * @param cars array of 0s and 1s representing the direction of consecutive cars on a road
     * @return count of pairs of passing cars or -1 if count exceeds  {@link #maxPassingCars} value
     */
    public int countPassingCars(int[] cars) {
        final int[][] countCars = countCars(cars);

        int lastEastCar = 0;
        int passingCarsCount = 0;
        for (int i = 0; i < cars.length; i++) {
            int eastCar = countCars[i][EAST_DIRECTION];
            if (eastCar == lastEastCar) {
                continue;
            }
            lastEastCar = eastCar;
            int carsInOppositeDirection = countCars[cars.length - 1][WEST_DIRECTION] - countCars[i][WEST_DIRECTION];
            passingCarsCount = passingCarsCount + carsInOppositeDirection;
            if (passingCarsCount > maxPassingCars) {
                return -1;
            }
        }
        return passingCarsCount;
    }

    private int[][] countCars(int[] cars) {
        final int[][] countCars = new int[cars.length][2];
        for (int i = 0; i < cars.length; i++) {
            if (i > 0) {
                countCars[i][EAST_DIRECTION] = countCars[i - 1][EAST_DIRECTION];
                countCars[i][WEST_DIRECTION] = countCars[i - 1][WEST_DIRECTION];
            }
            countCars[i][cars[i]]++;
        }
        return countCars;
    }
}
