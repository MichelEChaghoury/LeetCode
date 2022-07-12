package io.leetcode.algorithm.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicatesTest {

    private ContainsDuplicates underTest;

    @BeforeEach
    void setUp() {
        underTest = new ContainsDuplicates();
    }

    @Test
    void containsDuplicate_shouldReturnFalseWhenNoDuplicateWasFound() {
        // Given
        int[] nums = new int[]{1, 2, 3, 4};

        // When
        boolean actual = underTest.containsDuplicate(nums);

        // Then
        assertFalse(actual);
    }

    @Test
    void containsDuplicate_shouldReturnTrueWhenDuplicatesWasFound() {
        // Given
        int[] nums = new int[]{1, 2, 3, 1};

        // When
        boolean actual = underTest.containsDuplicate(nums);

        // Then
        assertTrue(actual);
    }
}
