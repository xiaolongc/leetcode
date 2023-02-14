package com.art.top100;

public class ContainerWMW {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            maxArea = height[i] > height[j] ?
                    Math.max(maxArea, (j - i) * height[j--]) :
                    Math.max(maxArea, (j - i) * height[i++]);
        }
        return maxArea;
    }


}
