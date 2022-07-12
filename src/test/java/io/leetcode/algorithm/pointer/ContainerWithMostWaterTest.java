package io.leetcode.algorithm.pointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater underTest;

    @BeforeEach
    void setUp() {
        underTest = new ContainerWithMostWater();
    }

    @Test
    void maxArea_shouldReturnTheMaximumAreaFound() {
        // Given
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        // When
        int actual = underTest.maxArea(height);
        int expected = 49;

        // Then
        assertEquals(expected, actual);
    }
}
