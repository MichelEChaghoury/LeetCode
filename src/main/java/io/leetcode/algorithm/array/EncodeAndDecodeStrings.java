package io.leetcode.algorithm.array;

import java.util.LinkedList;
import java.util.List;

public class EncodeAndDecodeStrings {
    // LintCode 659 | Level: Medium
    // https://www.lintcode.com/problem/659/

    // Design an algorithm to encode a list of strings to a string. The encoded
    // string is then sent over the network and is decoded back to the original list
    // of strings.

    // Please implement encode and decode

    // Example 1:
    // Input: ["lint","code","love","you"]
    // Output: ["lint","code","love","you"]
    // Explanation:
    // One possible encode method is: "lint:;code:;love:;you"

    // Example 2:
    // Input: ["we", "say", ":", "yes"]
    // Output: ["we", "say", ":", "yes"]
    // Explanation:
    // One possible encode method is: "we:;say:;:::;yes"

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            builder
                    .append(str.length())
                    .append("#")
                    .append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new LinkedList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + length;

            String subString = str.substring(start, end);
            strs.add(subString);

            i = end;
        }

        return strs;
    }

}
