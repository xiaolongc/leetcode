package com.ik.top100.d0214;

public class L11 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            max = Math.max((j - i) * Math.min(height[i], height[j]), max);
            if (height[i] < height[j]) {
                int nextI = i;
                while (++nextI < j) {
                    if (height[nextI] > height[i]) {
                        break;
                    }
                }
                i = nextI;
            } else {
                int nextJ = j;
                while (i < --nextJ) {
                    if (height[nextJ] > height[j]) {
                        break;
                    }
                }
                j = nextJ;
            }
        }
        return max;
    }
}
