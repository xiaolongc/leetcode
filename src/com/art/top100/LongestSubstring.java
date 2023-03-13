package com.art.top100;

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                left = left > map.get(chars[i]) + 1 ? left : (map.get(chars[i]) + 1);
            }
            map.put(chars[i], i);
            max = max > (i - left + 1) ? max : (i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abacadaba"));

    }
}
