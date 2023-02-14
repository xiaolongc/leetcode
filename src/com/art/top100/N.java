package com.art.top100;

import java.util.ArrayList;

/**
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * PA PA
 * PAYP PAYP
 * <p>
 * PAYPA PAYAP
 */
public class N {
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        ArrayList<StringBuilder> rows = new ArrayList<StringBuilder>();
        for(int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for(char c : s.toCharArray()) {
            rows.get(i).append(c);
            /**
             *  00  10 20  30  40  31  21  11  01   12  22  32
             *
             *  1                               9
             *      2                       8       a
             *          3               7               b
             *              4       6                       c
             *                  5
             *
             */
            if(i == 0 || i == numRows -1){
                flag = - flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
//
//    0 4 8
//    p   a  h
//    a p l s
//    y   I
//    0 6 12
//    p     a     h
//    d   o u    w
//    a p   l  s
//    y     I
//
//            "PAHNAPLSIIGYIR"
//             YLHIAASRGPIIN
}
