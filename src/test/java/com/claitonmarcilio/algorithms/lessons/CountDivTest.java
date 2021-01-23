package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDivTest {

    private final CountDiv countDiv = new CountDiv();

    @ParameterizedTest
    @MethodSource("missingIntegerTestCases")
    void runTests(int initialValue, int finalValue, int divisor, int expected) {
        assertEquals(expected, this.countDiv.countDivisibleInRange(initialValue, finalValue, divisor));
    }

    private static Stream<Arguments> missingIntegerTestCases() {
        return Stream.of(
                simple(),
                greaterThanLimit(),
                empty(),
                minimal(),
                largeValues(),
                allValues());
    }

    private static Arguments simple() {
        return Arguments.of(6, 11, 2, 3);
    }

    private static Arguments greaterThanLimit() {
        return Arguments.of(2, 3, 4, 0);
    }

    private static Arguments empty() {
        return Arguments.of(10, 10, 7, 0);
    }

    private static Arguments minimal() {
        return Arguments.of(0, 1, 11, 1);
    }

    private static Arguments largeValues() {
        return Arguments.of(0, 2000000000, 2, 1000000001);
    }

    private static Arguments allValues() {
        return Arguments.of(0, 2000000000, 1, 2000000001);
    }
}
