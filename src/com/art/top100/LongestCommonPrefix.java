package com.art.top100;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) return "";
//        if (strs.length==1)return strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length()) {
                    return strs[0].substring(0, i);
                }
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
