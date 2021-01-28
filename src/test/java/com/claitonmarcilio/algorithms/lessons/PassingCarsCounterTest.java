package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PassingCarsCounterTest {

    private static final int MAX_PASSING_CARS = 5;
    private PassingCarsCounter counter = new PassingCarsCounter(MAX_PASSING_CARS);

    @Test
    void passingCarsSimpleTest() {
        final int[] cars = new int[]{0, 1, 0, 1, 1};
        int count = counter.countPassingCars(cars);
        Assertions.assertEquals(5, count);
    }

    @Test
    void passingCarsLimitTest() {
        final int[] cars = new int[]{0, 1, 0, 1, 1, 0, 1};
        int count = counter.countPassingCars(cars);
        Assertions.assertEquals(-1, count);
    }
}
