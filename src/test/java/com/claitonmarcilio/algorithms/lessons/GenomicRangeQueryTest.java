package com.claitonmarcilio.algorithms.lessons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenomicRangeQueryTest {

    private final GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    void genomicRangeQueryTest() {
        final String dnaSequence = "CAGCCTA";
        final int[] initialIndexes = new int[]{2, 5, 0};
        final int[] finalIndexes = new int[]{4, 5, 6};

        final int[] result = genomicRangeQuery.query(dnaSequence, initialIndexes, finalIndexes);

        Assertions.assertArrayEquals(new int[]{2, 4, 1}, result);
    }
}
