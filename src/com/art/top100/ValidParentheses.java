package com.art.top100;

public class ValidParentheses {
    private static int hash(char a) {
        switch (a) {
            case '(':
                return 1;
            case ')':
                return 2;
            case '[':
                return 3;
            case ']':
                return 4;
            case '{':
                return 5;
            case '}':
                return 6;
            default:
                return -1;
        }
    }

    public static boolean isValid(String s) {
        int length = s.length();
        if (length == 1) {
            return false;
        }
        int j = 0;
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            int c = hash(s.charAt(i));
            if (c % 2 == 1) {
                ints[j] = c;
                j++;
            } else {
                // c - ints[--j] != 1
                if (j == 0 || c - ints[--j] != 1) {
                    return false;
                }
            }
        }
        return j == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("((()))(())"));
    }
}
