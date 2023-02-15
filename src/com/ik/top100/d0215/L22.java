package com.ik.top100.d0215;

import java.util.ArrayList;
import java.util.List;

public class L22 {

    public List<String> generateParenthesis(int n) {
        List<String> coll = new ArrayList<>();
        dfs(0, n, 0, new char[n * 2], coll);
        return coll;
    }

    private void dfs(int deep, int l, int r, char[] c, List<String> coll) {
        if (l > 0) {
            c[deep] = '(';
            dfs(deep + 1, l - 1, r + 1, c, coll);
        }
        if (r > 0) {
            c[deep] = ')';
            dfs(deep + 1, l, r - 1, c, coll);
        }
        if (deep == c.length-1) {
            coll.add(new String(c));
        }
    }
}
