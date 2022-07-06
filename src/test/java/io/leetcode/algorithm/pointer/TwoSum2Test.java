package io.leetcode.algorithm.pointer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSum2Test {

    private TwoSum2 underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSum2();
    }

    @Test
    void twoSum_shouldReturnIndexesOfValuesThatSumsToTheTargetIncrementedByOne() {
        // Given
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;

        // When
        int[] actual = underTest.twoSum(numbers, target);
        int[] expected = new int[] { 1, 2 };

        // Then
        assertArrayEquals(expected, actual);
    }
}
