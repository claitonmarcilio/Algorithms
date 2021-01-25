package com.claitonmarcilio.algorithms.lessons;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static final int NUMBER_OF_NUCLEOTIDES = 4;

    public int[] query(String dnaSequence, int[] initialIndexes, int[] finalIndexes) {
        final int[][] dnaCounters = getDnaValues(dnaSequence);

        final int indexSize = initialIndexes.length;
        final int[] result = new int[indexSize];
        final int[] empty = new int[NUMBER_OF_NUCLEOTIDES];

        for (int i = 0; i < initialIndexes.length; i++) {
            int initialIndex = initialIndexes[i];
            int finalIndex = finalIndexes[i];
            if (initialIndex == finalIndex) {
                result[i] = getDnaValue(dnaSequence.toCharArray()[initialIndex]);
                continue;
            }
            int[] initialCounter = initialIndex == 0 ? empty : dnaCounters[initialIndex - 1];
            int[] finalCounter = dnaCounters[finalIndex];
            result[i] = getMin(initialCounter, finalCounter);
        }
        return result;
    }

    private int getMin(int[] initialCounter, int[] finalCounter) {
        for (int i = 0; i < NUMBER_OF_NUCLEOTIDES; i++) {
            if (initialCounter[i] < finalCounter[i]) {
                return i + 1;
            }
        }
        throw new IllegalStateException("Counters state is invalid.");
    }

    private int[][] getDnaValues(String dnaSequence) {
        final int[][] dnaCounters = new int[dnaSequence.length()][NUMBER_OF_NUCLEOTIDES];
        char[] dnaArray = dnaSequence.toCharArray();
        for (int i = 0; i < dnaArray.length; i++) {
            final char nucleotide = dnaArray[i];
            int dnaValue = getDnaValue(nucleotide);
            if (i == 0) {
                dnaCounters[i][dnaValue - 1] = 1;
            } else {
                dnaCounters[i] = Arrays.copyOf(dnaCounters[i - 1], NUMBER_OF_NUCLEOTIDES);
                dnaCounters[i][dnaValue - 1] = dnaCounters[i - 1][dnaValue - 1] + 1;
            }
        }
        return dnaCounters;
    }

    private int getDnaValue(char nucleotide) {
        switch (nucleotide) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
        }
        throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
    }
}
