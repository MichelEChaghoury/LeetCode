package io.leetcode.algorithm.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    // LeetCode 128 | Level Medium
    // https://leetcode.com/problems/longest-consecutive-sequence/

    // Given an unsorted array of integers nums, return the length of the longest
    // consecutive elements sequence.

    // You must write an algorithm that runs in O(n) time.

    // Example 1:
    // Input: nums = [100,4,200,1,3,2]
    // Output: 4
    // Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
    // Therefore its length is 4.

    // Example 2:
    // Input: nums = [0,3,7,2,5,8,4,6,0,1]
    // Output: 9

    // Constraints:

    // 0 <= nums.length <= 105
    // -109 <= nums[i] <= 109

    public int longestConsecutive(int[] nums) {

        if (nums.length < 2) return nums.length;


        int counter = 1;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int number : nums) {

            if (set.contains(number - 1)) continue;

            int currentCounter = 1;
            int num = number + 1;

            while (set.contains(num)) {
                currentCounter++;
                num++;
            }

            counter = Math.max(counter, currentCounter);
        }

        return counter;
    }

}
