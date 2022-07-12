package io.leetcode.algorithm.pointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private TrappingRainWater underTest;

    @BeforeEach
    void setUp() {
        underTest = new TrappingRainWater();
    }

    @Test
    void trap_shouldReturnTheAmountOfWaterTrapped() {
        // Given
        int[] height = new int[]{4, 2, 0, 3, 2, 5};

        // When
        int actual = underTest.trap(height);
        int expected = 9;

        // Then
        assertEquals(expected, actual);
    }
}
