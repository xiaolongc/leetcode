package com.art.top100.c0218;

public class SortedArraySearch {
    public static void main(String[] args) {
        SortedArraySearch search = new SortedArraySearch();
        System.out.println(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));

        System.out.println(search.search(new int[]{1, 3}, 3));

    }

    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) return -1;
        if (nums.length == 1 && nums[0] != target) return -1;
        //二分
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (middle <= right && middle >= left) {
            middle = (left + right) / 2;
            //解决偶数和奇数两种case
            if (nums[middle] == target) return middle;
            if (nums[right] == target) return right;
            if (nums[middle] > nums[left]) {
                if (target > nums[middle] || target < nums[left]) {
                    left = middle;
                } else if (target >= nums[left] && target < nums[middle]) {
                    right = middle;
                }
            } else if (nums[middle] < nums[left]) {
                if (target < nums[left] && target > nums[middle]) {
                    left = middle;
                } else if (target >= nums[left] || target < nums[middle]) {
                    right = middle;
                }
            } else {
                return -1;
            }

        }
        return -1;

    }

}
