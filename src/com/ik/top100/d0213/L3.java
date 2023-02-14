package com.ik.top100.d0213;

public class L3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int maxLength = 1;
        int length = 1;
        int startIdx = 0;
        int endIdx = 0;
        int[] mapping = new int[128];
        mapping[s.charAt(startIdx)] = 1;
        while (endIdx < s.length() - 1) {
            endIdx++;
            mapping[s.charAt(endIdx)]++;
            length++;
            if (mapping[s.charAt(endIdx)] == 1) {
                maxLength = Math.max(length, maxLength);
                continue;
            }
            while (startIdx < endIdx) {
                mapping[s.charAt(startIdx)]--;
                startIdx++;
                length--;
                if (mapping[s.charAt(startIdx - 1)] == 1) {
                    break;
                }
            }
        }
        return maxLength;
    }
}
