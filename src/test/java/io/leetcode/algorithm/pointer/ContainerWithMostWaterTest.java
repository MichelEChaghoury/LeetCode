package io.leetcode.algorithm.pointer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater underTest;

    @BeforeEach
    void setUp() {
        underTest = new ContainerWithMostWater();
    }

    @Test
    void maxArea_shouldReturnTheMaxiumAreaFound() {
        // Given
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        // When
        int actual = underTest.maxArea(height);
        int expected = 49;

        // Then
        assertEquals(expected, actual);
    }
}
