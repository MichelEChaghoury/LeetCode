package io.leetcode.algorithm.pointer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {

    private ThreeSum underTest;

    @BeforeEach
    void setUp() {
        underTest = new ThreeSum();
    }

    @Test
    void threeSum_shouldReturnEmptyListWhenNoPossibleTripletWasFound() {
        // Given
        int[] nums = new int[] { 0, 1, 1 };

        // When
        List<List<Integer>> actual = underTest.threeSum(nums);
        List<Integer> expected = new LinkedList<>();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void threeSum_shouldReturnListOfAllPossibleTripletFound() {
        // Given
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };

        // When
        List<List<Integer>> actual = underTest.threeSum(nums);
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        // Then
        assertEquals(expected, actual);
    }
}
