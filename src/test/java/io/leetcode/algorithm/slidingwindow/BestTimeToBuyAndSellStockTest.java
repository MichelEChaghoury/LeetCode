package io.leetcode.algorithm.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock underTest;

    @BeforeEach
    void setUp() {
        underTest = new BestTimeToBuyAndSellStock();
    }

    @Test
    void maxProfit_shouldReturnZeroWhenWhenNoProfitableTranslationWasFound() {
        // Given
        int[] prices = new int[]{8, 7, 6, 4, 3, 1, 1};

        // When
        int actual = underTest.maxProfit(prices);
        int expected = 0;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void maxProfit_shouldReturnTheMaximumProfitableTransaction() {
        // Given
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        // When
        int actual = underTest.maxProfit(prices);
        int expected = 5;

        // Then
        assertEquals(expected, actual);
    }
}
