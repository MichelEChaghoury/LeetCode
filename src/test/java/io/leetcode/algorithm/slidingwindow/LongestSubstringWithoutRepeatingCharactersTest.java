package io.leetcode.algorithm.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters underTest;

    @BeforeEach
    void setUp() {
        underTest = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void lengthOfLongestSubstring_shouldReturnOneWhenArrayContainsOnlyOneElement() {
        // Given
        String s = "b";

        // When
        int actual = underTest.lengthOfLongestSubstring(s);
        int expected = 1;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturnZeroWhenArrayIsEmpty() {
        // Given
        String s = "";

        // When
        int actual = underTest.lengthOfLongestSubstring(s);
        int expected = 0;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void lengthOfLongestSubstring_shouldReturnLengthOfLongestSubstringWithoutRepeatingCharacters() {
        // Given
        String s = "abcabcbb";

        // When
        int actual = underTest.lengthOfLongestSubstring(s);
        int expected = 3;

        // Then
        assertEquals(expected, actual);
    }
}
