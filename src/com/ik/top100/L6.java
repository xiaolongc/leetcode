package com.ik.top100;

public class L6 {
    public String convert(String s, int numRows) {
        public String convert(String s, int numRows) {
            if(numRows == 1){
                return s;
            }
            char[] rst = s.toCharArray();
            int step = numRows - 1;
            int step2 = step * 2;
            int i = 0;
            for (int row = 0; row < numRows; row++) {
                int col = 0;
                if (row == 0) {
                    while (col < s.length()) {
                        rst[i++] = s.charAt(col);
                        col += step2;
                    }
                    continue;
                }
                col = row;
                int col2 = step2 - row;
                int colIdx = 0;
                if (row < numRows - 1) {
                    while (col < s.length() || col2 < s.length()) {
                        if (colIdx % 2 == 0) {
                            rst[i++] = s.charAt(col);
                            col += step2;
                            colIdx++;
                        } else {
                            rst[i++] = s.charAt(col2);
                            col2 += step2;
                            colIdx++;
                        }
                    }
                    continue;
                }
                col = step;
                while (col < s.length()) {
                    rst[i++] = s.charAt(col);
                    col += step2;
                }
            }
            return new String(rst);
        }
    }

}
