package com.art.top100.c0217;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }


    public static void con(StringBuilder s) {
        s.deleteCharAt(s.length() - 1);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> list, StringBuilder s, int left, int right, int max) {
        if (s.length() == max * 2) {
            list.add(s.toString());
            return;
        }
        if (left < max) {
            s.append("(");
            backtrack(list, s, left + 1, right, max);
            s.deleteCharAt(s.length() - 1);
        }
        if (right < left) {
            s.append(")");
            backtrack(list, s, left, right + 1, max);
            s.deleteCharAt(s.length() - 1);
        }

    }

    /**
     *
     *   3
     *   * （
     *     （    ）
     *  （  ）  （   *
     *
     *
     *
     *
     *
     */
}
