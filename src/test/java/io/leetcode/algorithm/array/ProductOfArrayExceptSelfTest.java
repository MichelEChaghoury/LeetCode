package io.leetcode.algorithm.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf underTest;

    @BeforeEach
    void setUp() {
        underTest = new ProductOfArrayExceptSelf();
    }

    @Test
    void productExceptSelf_shouldReturnProductOfArrayWithoutCurrentIndexedValue() {
        // Given
        int[] nums = new int[] { 1, 2, 3, 4 };

        // When
        int[] actual = underTest.productExceptSelf(nums);
        int[] expected = new int[] { 24, 12, 8, 6 };

        // Then
        assertArrayEquals(expected, actual);
    }
}
