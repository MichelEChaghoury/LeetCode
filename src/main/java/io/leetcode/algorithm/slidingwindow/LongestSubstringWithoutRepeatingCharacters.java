package io.leetcode.algorithm.slidingwindow;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    // LeetCode 3 | Level: Medium
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/

    // Given a string s, find the length of the longest substring without repeating
    // characters.

    // Example 1:
    // Input: s = "abcabcbb"
    // Output: 3
    // Explanation: The answer is "abc", with the length of 3.

    // Example 2:
    // Input: s = "bbbbb"
    // Output: 1
    // Explanation: The answer is "b", with the length of 1.

    // Example 3:
    // Input: s = "pwwkew"
    // Output: 3
    // Explanation: The answer is "wke", with the length of 3.
    // Notice that the answer must be a substring, "pwke" is a subsequence and not a
    // substring.

    // Constraints:

    // 0 <= s.length <= 5 * 104
    // s consists of English letters, digits, symbols and spaces.

    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) return s.length();

        char[] chars = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        int result = 0;
        int left = 0;
        int right = 1;

        set.add(chars[left]);

        while (left < right && right < chars.length) {
            while (set.contains(chars[right])) {
                set.remove(chars[left]);
                left += 1;
            }

            set.add(chars[right]);
            int currentSubstringLength = right - left + 1;
            result = Math.max(result, currentSubstringLength);

            right += 1;
        }

        return result;
    }
}
