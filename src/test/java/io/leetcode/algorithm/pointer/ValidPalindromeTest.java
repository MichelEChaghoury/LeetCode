package io.leetcode.algorithm.pointer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    private ValidPalindrome underTest;

    @BeforeEach
    void setUp() {
        underTest = new ValidPalindrome();
    }

    @Test
    void isPalindrome_shouldReturnTrueWhenStringIsBlank() {
        // Given
        String s = " ";

        // When
        boolean actual = underTest.isPalindrome(s);

        // Then
        assertTrue(actual);

    }

    @Test
    void isPalindrome_shouldReturnFalseWhenConsideredInvalid() {
        // Given
        String s = "race a car";

        // When
        boolean actual = underTest.isPalindrome(s);

        // Then
        assertFalse(actual);
    }

    @Test
    void isPalindrome_shouldReturnTrueWhenConsideredValid() {
        // Given
        String s = "A man, a plan, a canal: Panama";

        // When
        boolean actual = underTest.isPalindrome(s);

        // Then
        assertTrue(actual);
    }
}
