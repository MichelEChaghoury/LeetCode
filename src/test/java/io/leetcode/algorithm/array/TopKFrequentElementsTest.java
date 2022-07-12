package io.leetcode.algorithm.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTest {

    private TopKFrequentElements underTest;

    @BeforeEach
    void setUp() {
        underTest = new TopKFrequentElements();
    }

    @Test
    void TopKFrequent_shouldReturnTheMostKFrequentElements() {
        // Given
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        // When
        int[] actual = underTest.topKFrequent(nums, k);
        int[] expected = new int[]{1, 2};

        // Then
        assertArrayEquals(expected, actual);
    }
}
