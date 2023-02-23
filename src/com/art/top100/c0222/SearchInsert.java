package com.art.top100.c0222;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        //找到第一个小于等于的数的位置
        if (nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                right = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[left] < target) {
            return left + 1;
        }
        return left;
    }
}
