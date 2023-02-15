package com.art.top100;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private final String[] voc = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList();
        if (digits == null || digits.length() == 0) return res;
        lc(digits, 0, "", res);
        return res;
    }

    public void lc(String digits, int index, String s, List<String> res) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }
        int i = digits.charAt(index) - '0';
        for (char c : voc[i - 2].toCharArray()) {
            lc(digits, index + 1, s + c, res);
        }
    }

}
