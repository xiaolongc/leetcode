package com.ik.top100.d0214;

public class L14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder b = new StringBuilder();
        int i = 0;
        while (true) {
            if (i == strs[0].length()) {
                break;
            }
            char c = strs[0].charAt(i);
            boolean fill = true;
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    fill = false;
                    break;
                }
            }
            if (fill) {
                b.append(c);
            } else {
                break;
            }
            i++;
        }
        return b.toString();
    }
}
