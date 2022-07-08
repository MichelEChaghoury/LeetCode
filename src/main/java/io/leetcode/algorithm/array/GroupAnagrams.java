package io.leetcode.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    // LeetCode 49 | Level: Medium
    // https://leetcode.com/problems/group-anagrams/

    // Given an array of strings strs, group the anagrams together. You can return
    // the answer in any order.

    // An Anagram is a word or phrase formed by rearranging the letters of a
    // different word or phrase, typically using all the original letters exactly
    // once.

    // Example 1:
    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    // Example 2:
    // Input: strs = [""]
    // Output: [[""]]

    // Example 3:
    // Input: strs = ["a"]
    // Output: [["a"]]

    // Constraints:

    // 1 <= strs.length <= 104
    // 0 <= strs[i].length <= 100
    // strs[i] consists of lowercase English letters.

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> results = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();

        if (strs.length == 1) {
            List<String> value = List.of(strs);
            results.add(value);

            return results;
        }

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();

            Arrays.sort(chars);
            String key = Arrays.toString(chars);

            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }

            map.get(key).add(str);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> values = entry.getValue();
            results.add(values);
        }

        return results;
    }
}
