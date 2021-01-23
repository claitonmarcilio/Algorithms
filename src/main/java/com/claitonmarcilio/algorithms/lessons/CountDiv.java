package com.claitonmarcilio.algorithms.lessons;

public class CountDiv {

    /**
     * Count the number of divisible values existing in a range
     *
     * @param initialValue initial value of the range
     * @param finalValue   final value of the range
     * @param divisor      divisor value
     * @return count of divisible values in range
     */
    public int countDivisibleInRange(int initialValue, int finalValue, int divisor) {
        if (divisor > finalValue) {
            if (initialValue == 0) {
                return 1;
            }
            return 0;
        }
        int allDivisibleCount = finalValue / divisor;
        int outOfBoundsLastNumber = initialValue - 1;
        int outOfBoundsCount = outOfBoundsLastNumber / divisor;

        if (initialValue == 0 && outOfBoundsCount >= 0) {
            return allDivisibleCount - outOfBoundsCount + 1;
        }
        return allDivisibleCount - outOfBoundsCount;
    }
}
