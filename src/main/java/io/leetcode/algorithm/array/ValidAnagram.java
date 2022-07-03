package io.leetcode.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // LeetCode 242. | Level: Easy
    // https://leetcode.com/problems/valid-anagram/

    // Given two strings s and t, return true if t is an anagram of s, and false
    // otherwise.

    // An Anagram is a word or phrase formed by rearranging the letters of a
    // different word or phrase, typically using all the original letters exactly
    // once.

    // Example 1:

    // Input: s = "anagram", t = "nagaram"
    // Output: true
    // Example 2:

    // Input: s = "rat", t = "car"
    // Output: false

    // Constraints:

    // 1 <= s.length, t.length <= 5 * 104
    // s and t consist of lowercase English letters.

    // Follow up: What if the inputs contain Unicode characters? How would you adapt
    // your solution to such a case?

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int n = s.length();
        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        Map<Character, Integer> sourceMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char sourceChar = source[i];
            char targetChar = target[i];

            sourceMap.put(sourceChar, sourceMap.getOrDefault(sourceChar, 0) + 1);
            targetMap.put(targetChar, targetMap.getOrDefault(targetChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sourceMap.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (!targetMap.containsKey(key) || targetMap.get(key) != value) {
                return false;
            }
        }

        return true;
    }
}
