package io.leetcode.algorithm.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence underTest;

    @BeforeEach
    void setUp() {
        underTest = new LongestConsecutiveSequence();
    }

    @Test
    void longestConsecutive_shouldReturnOneWhenArrayContainsOnlyOneElement() {
        // Given
        int[] nums = new int[] { 2 };

        // When
        int actual = underTest.longestConsecutive(nums);
        int expected = 1;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void longestConsecutive_shouldReturnZeroWhenArrayIsEmpty() {
        // Given
        int[] nums = new int[] {};

        // When
        int actual = underTest.longestConsecutive(nums);
        int expected = 0;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void longestConsecutive_shouldReturnLongestConsecutiveSequenceSize() {
        // Given
        int[] nums = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        // When
        int actual = underTest.longestConsecutive(nums);
        int expected = 9;

        // Then
        assertEquals(expected, actual);
    }
}
