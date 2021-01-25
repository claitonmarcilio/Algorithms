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

    @Test
    void throwsExceptionWhenInvalidNucleotide() {
        final String dnaSequence = "F";
        final int[] initialIndexes = new int[]{0};
        final int[] finalIndexes = new int[]{0};

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> genomicRangeQuery.query(dnaSequence, initialIndexes, finalIndexes));
    }

    @Test
    void throwsExceptionWhenCounterStateIsInvalid() {
        final String dnaSequence = "CAGCCTA";
        final int[] initialIndexes = new int[]{6};
        final int[] finalIndexes = new int[]{0};

        Assertions.assertThrows(IllegalStateException.class,
                () -> genomicRangeQuery.query(dnaSequence, initialIndexes, finalIndexes));
    }
}
