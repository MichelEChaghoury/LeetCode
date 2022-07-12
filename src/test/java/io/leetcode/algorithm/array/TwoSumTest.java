package io.leetcode.algorithm.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    private TwoSum underTest;

    @BeforeEach
    void setUp() {
        underTest = new TwoSum();
    }

    @Test
    void twoSum_shouldReturnIndexesOfValuesThatSumsToTheTarget() {
        // Given
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        // When
        int[] actual = underTest.twoSum(nums, target);
        int[] expected = new int[]{0, 1};

        // Then
        assertArrayEquals(expected, actual);
    }
}
