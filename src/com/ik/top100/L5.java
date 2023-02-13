package com.ik.top100;

import java.util.Arrays;

public class L5 {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxLen = 1, start = 0, end = 0;
        int step = 1;
        boolean[] len = new boolean[s.length()];
        Arrays.fill(len, true);
        //1 0 0 1 babab 11111
        // 01110
        while (step * 2 < s.length()) {
            boolean allSkip = true;
            for (int i = step - 1; i < s.length() - step + 1; i++) {
                if (!len[i]) {
                    continue;
                }
                if (i - step < 0 || i + step >= s.length()) {
                    len[i] = false;
                    continue;
                }
                if (s.charAt(i - step) != s.charAt(i + step)) {
                    len[i] = false;
                    continue;
                }
                if (maxLen < step * 2 + 1) {
                    maxLen = step * 2 + 1;
                    start = i - step;
                    end = i + step;
                }
                allSkip = false;
            }
            if (allSkip) {
                break;
            }
            step++;
        }
        Arrays.fill(len, true);
        step = 1;
        while (step * 2 <= s.length()) {
            boolean allSkip = true;
            for (int i = step - 1; i < s.length() - step + 1; i++) {
                if (!len[i]) {
                    continue;
                }
                if (i - step + 1 < 0 || i + step >= s.length()) {
                    len[i] = false;
                    continue;
                }
                if (s.charAt(i - step + 1) != s.charAt(i + step)) {
                    len[i] = false;
                    continue;
                }
                if (maxLen < step * 2) {
                    maxLen = step * 2;
                    start = i - step + 1;
                    end = i + step;
                }
                allSkip = false;
            }
            if (allSkip) {
                break;
            }
            step++;
        }
        return s.substring(start, end + 1);
    }
}
