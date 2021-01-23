package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    private final MissingInteger missingInteger = new MissingInteger();

    @Test
    void findMissingOnPermutationTest() {
        int[] values = new int[]{2, 3, 1, 5};
        int missingElement = missingInteger.findMissingOnPermutation(values);
        assertEquals(4, missingElement);
    }

    @ParameterizedTest
    @MethodSource("missingIntegerTestCases")
    void runTests(int[] values, int expected) {
        assertEquals(expected, this.missingInteger.findMissingInteger(values));
    }

    private static Stream<Arguments> missingIntegerTestCases() {
        return Stream.of(
                simpleValues(),
                afterAllValues(),
                allNegativeValues());
    }

    private static Arguments simpleValues() {
        return Arguments.of(new int[]{1, 3, 6, 4, 1, 2}, 5);
    }

    private static Arguments afterAllValues() {
        return Arguments.of(new int[]{1, 2, 3}, 4);
    }

    private static Arguments allNegativeValues() {
        return Arguments.of(new int[]{-1, -2, -3}, 1);
    }


}