package io.leetcode.algorithm.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestRepeatingCharacterReplacementTest {

    private LongestRepeatingCharacterReplacement underTest;

    @BeforeEach
    void setUp() {
        underTest = new LongestRepeatingCharacterReplacement();
    }

    @Test
    void characterReplacement_shouldReturnLongestSubstringLength() {
        // Given
        String s = "AABABBA";
        int k = 1;

        // When
        int actual = underTest.characterReplacement(s, k);
        int expected = 4;

        // Then
        assertEquals(expected, actual);
    }
}