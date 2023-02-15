package com.ik.top100.d0215;

public class L20 {
    public boolean isValid(String s) {
        char[] mapping = new char[128];
        char[] stack = new char[s.length()];
        mapping[')'] = '(';
        mapping[']'] = '[';
        mapping['}'] = '{';
        int i = 0;
        for (char c : s.toCharArray()) {
            if (mapping[c] != 0) {
                if (i == 0) {
                    return false;
                }
                if (stack[i-1] != mapping[c]) {
                    return false;
                }
                i--;
            } else {
                stack[i++] = c;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new L20().isValid("()");
    }
}
