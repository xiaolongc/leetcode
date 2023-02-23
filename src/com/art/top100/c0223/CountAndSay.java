package com.art.top100.c0223;

public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = recursion(result);
        }
        return result;
    }

    public String recursion(String parm) {
        int carry = 0;
        char cur = 'a';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parm.length(); i++) {
            if (cur == parm.charAt(i)) {
                carry++;
            } else {
                if (carry > 0) {
                    result.append(carry).append(cur);
                }
                cur = parm.charAt(i);
                carry = 1;
            }
            if (i == parm.length() - 1 && carry > 0) {
                result.append(carry).append(cur);
            }
        }
        return result.toString();
    }
}
