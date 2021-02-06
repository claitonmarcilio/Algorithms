package com.claitonmarcilio.algorithms.lessons.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDistinctTest {

    private final CountDistinct countDistinct = new CountDistinct();

    @Test
    void countDistinctSimpleTest() {
        final int[] values = new int[]{2, 1, 1, 2, 3, 1};
        final int count = countDistinct.countDistinc(values);
        Assertions.assertEquals(3, count);
    }

    @Test
    void countDistinctEmptyTest() {
        final int[] values = new int[]{};
        final int count = countDistinct.countDistinc(values);
        Assertions.assertEquals(0, count);
    }
}
