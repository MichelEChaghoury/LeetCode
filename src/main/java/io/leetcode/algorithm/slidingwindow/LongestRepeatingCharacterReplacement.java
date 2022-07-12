package io.leetcode.algorithm.slidingwindow;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    // LeetCode 424 | Level: Medium
    // https://leetcode.com/problems/longest-repeating-character-replacement/

    // You are given a string s and an integer k.
    // You can choose any character of the string and change it to any other
    // uppercase English character.
    // You can perform this operation at most k times.

    // Return the length of the longest substring containing the same letter
    // you can get after performing the above operations.

    // Example 1:
    // Input: s = "ABAB", k = 2
    // Output: 4
    // Explanation: Replace the two 'A's with two 'B's or vice versa.

    // Example 2:
    // Input: s = "AABABBA", k = 1
    // Output: 4
    // Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA.
    // The substring "BBBB" has the longest repeating letters, which is 4."

    // Constraints:

    // 1 <= s.length <= 105
    // s consists of only uppercase English letters.
    // 0 <= k <= s.length

    public int characterReplacement(String s, int k) {
        char[] characters = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();

        int result = 0;
        int left = 0;
        int right = 1;

        map.put(characters[left], 1);

        int maxCharacterCount = 1;

        while (left < right && right < characters.length) {
            map.put(characters[right], map.getOrDefault(characters[right], 0) + 1);
            maxCharacterCount = Math.max(maxCharacterCount, map.get(characters[right]));

            while (left < right && (right - left + 1) - maxCharacterCount > k) {
                if (map.get(characters[left]) > 1) {
                map.put(characters[left], map.get(characters[left]) - 1);
                } else {
                    map.remove(characters[left]);
                }

                left += 1;
            }

            result = Math.max(result, right - left + 1);
            right += 1;
        }

        return result;
    }
}
