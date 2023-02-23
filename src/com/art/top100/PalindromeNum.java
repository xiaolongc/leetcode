package com.art.top100;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12021));
        System.out.println(isPalindrome(1221));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int cur = 0;
        int num = x;
        while (num != 0) {
            cur = cur * 10 + num % 10;
            num = num / 10;
        }
        return cur == x;
    }

}
