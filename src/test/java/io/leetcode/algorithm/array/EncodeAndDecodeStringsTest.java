package io.leetcode.algorithm.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class EncodeAndDecodeStringsTest {

    private EncodeAndDecodeStrings underTest;

    @BeforeEach
    void setUp() {
        underTest = new EncodeAndDecodeStrings();
    }

    @Test
    void encode_shouldConcatenateAllElementsOfArrayWithDelimiterBetweenEachString() {
        // Given
        List<String> str = List.of("lint", "code", "love", "you");

        // When
        String actual = underTest.encode(str);
        String expected = "4#lint4#code4#love3#you";

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void decode_shouldCreateArrayOfGivenStringUsingDelimiters() {
        // Given
        String str = "4#lint4#code4#love3#you";

        // When
        List<String> actual = underTest.decode(str);
        List<String> expected = List.of("lint", "code", "love", "you");

        // Then
        assertIterableEquals(expected, actual);
    }
}
