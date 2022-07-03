package io.leetcode.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // LeetCode 1. | Level: Easy
    // https://leetcode.com/problems/two-sum/

    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to target.

    // You may assume that each input would have exactly one solution, and you may
    // not use the same element twice.

    // You can return the answer in any order.

    // Example 1:

    // Input: nums = [2,7,11,15], target = 9
    // Output: [0,1]
    // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    // Example 2:

    // Input: nums = [3,2,4], target = 6
    // Output: [1,2]
    // Example 3:

    // Input: nums = [3,3], target = 6
    // Output: [0,1]

    // Constraints:

    // 2 <= nums.length <= 104
    // -109 <= nums[i] <= 109
    // -109 <= target <= 109
    // Only one valid answer exists.

    // Follow-up: Can you come up with an algorithm that is less than O(n2) time
    // complexity?

    public int[] twoSum(int[] nums, int target) {

        // store each value of nums with it's respective index
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;

            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;

                break;
            } else {
                map.put(currentNumber, i);
            }

        }

        return result;
    }
}