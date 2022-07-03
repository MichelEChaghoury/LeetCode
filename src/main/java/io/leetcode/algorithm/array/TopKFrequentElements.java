package io.leetcode.algorithm.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    // LeetCode 347 | Level: Medium

    // Given an integer array nums and an integer k, return the k most frequent
    // elements. You may return the answer in any order.

    // Example 1:
    // Input: nums = [1,1,1,2,2,3], k = 2
    // Output: [1,2]

    // Example 2:
    // Input: nums = [1], k = 1
    // Output: [1]

    // Constraints:

    // 1 <= nums.length <= 105
    // k is in the range [1, the number of unique elements in the array].
    // It is guaranteed that the answer is unique.

    // Follow up: Your algorithm's time complexity must be better than O(n log n),
    // where n is the array's size.

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        int[] results = new int[k];

        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(entry.getKey());
        }

        for (int i = 0; i < k; i++) {
            int element = queue.poll();
            results[i] = element;

        }

        return results;
    }

}
