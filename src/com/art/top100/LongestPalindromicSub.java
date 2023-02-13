package com.art.top100;

public class LongestPalindromicSub {
    public static String longestPalindrome(String s){
        if (s==null || s.length()==0){
            return "";
        }
        int left=0;
        int right=0;
        for (int i =0;i<s.length();i++){
            int one = around(s,i,i);
            int two = around(s,i,i+1);
            int max = one>two?one:two;
            if (max > right-left){
                left=i-(max-1)/2;
                right=i+max/2;
            }
        }
        return s.substring(left,right+1);
    }

    public static int around(String s,int l,int r){
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        System.out.println( longestPalindrome("abcb"));
    }
}
