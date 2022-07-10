package io.leetcode.algorithm.pointer;

public class TrappingRainWater {
    // LeetCode 42 | Level: Hard
    // https://leetcode.com/problems/trapping-rain-water/

    // Given n non-negative integers representing an elevation map where the width
    // of each bar is 1, compute how much water it can trap after raining.

    // Example 1:
    // Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    // Output: 6

    // Example 2:
    // Input: height = [4,2,0,3,2,5]
    // Output: 9

    // Constraints:
    // n == height.length
    // 1 <= n <= 2 * 104
    // 0 <= height[i] <= 105

    public int trap(int[] height) {
        int result = 0;

        int left = 0;
        int right = height.length - 1;

        int minLeft = height[left];
        int minRight = height[right];

        while (left <= right) {
            if (minLeft < minRight) {
                if (minLeft - height[left] < 0) {
                    minLeft = height[left];
                } else {
                    result += minLeft - height[left];
                }

                left += 1;
            } else {
                if (minRight - height[right] < 0) {
                    minRight = height[right];
                } else {
                    result += minRight - height[right];
                }

                right -= 1;
            }
        }

        return result;
    }
}
