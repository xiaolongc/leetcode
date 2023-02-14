package com.ik.top100.d0214;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L17 {

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        Map<Character, char[]> cmap = new HashMap<>();
        cmap.put('2', "abc".toCharArray());
        cmap.put('3', "def".toCharArray());
        cmap.put('4', "ghi".toCharArray());
        cmap.put('5', "jkl".toCharArray());
        cmap.put('6', "mno".toCharArray());
        cmap.put('7', "pqrs".toCharArray());
        cmap.put('8', "tuv".toCharArray());
        cmap.put('9', "wxyz".toCharArray());

        int[] counter = new int[digits.length()];
        List<char[]> holder = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            holder.add(cmap.get(c));
        }
        char[] r = new char[digits.length()];
        List<String> rst = new ArrayList<>();
        while (true) {
            for (int i = 0; i < counter.length; i++) {
                r[i] = holder.get(i)[counter[i]];
            }
            rst.add(new String(r));
            int i = 0;
            while (true) {
                if (i == holder.size()) {
                    return rst;
                }
                counter[i]++;
                if (counter[i] == holder.get(i).length) {
                    counter[i] = 0;
                    i++;
                } else {
                    break;
                }
            }
        }
    }

}
