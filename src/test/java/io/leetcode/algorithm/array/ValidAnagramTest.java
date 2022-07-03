package io.leetcode.algorithm.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    private ValidAnagram underTest;

    @BeforeEach
    void setUp() {
        underTest = new ValidAnagram();
    }

    @Test
    void isAnagram_shouldReturnTrueWhenConsideredValidAnagrams() {
        // Given
        String s = "anagram";
        String t = "nagaram";

        // When
        boolean actual = underTest.isAnagram(s, t);

        // Then
        assertTrue(actual);
    }

    @Test
    void isAnagram_shouldReturnFalseWhenNotConsideredValidAnagrams() {
        // Given
        String s = "rat";
        String t = "car";

        // When
        boolean actual = underTest.isAnagram(s, t);

        // Then
        assertFalse(actual);
    }
}
