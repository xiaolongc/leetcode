package com.art.top100.c0219;

public class SearchRange_FindPosition {
    private static int findFirstPosition(int[] nums, int target) {
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
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    private static int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findFirstPosition(new int[]{1, 1, 1, 2, 2, 2, 3}, 2));
        System.out.println(findLastPosition(new int[]{1, 1, 1, 2, 2, 2, 3}, 2));

    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length < 1) return result;
        int first = findFirstPosition(nums, target);
        if (first == -1) return result;
        int last = findLastPosition(nums, target);
        result = new int[]{first, last};
        return result;
    }
}
