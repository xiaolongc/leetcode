package com.art.top100.c0218;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
//        int i = 0 ,j = 1;
//        while (i<nums.length&&j<nums.length){
//            if (nums[i]==val){
//                if (nums[j]!=val){
//                    nums[i] = nums[j];
//                }
//                j++;
//            }
//            i++;
//        }
//        return i+1;

        if (nums == null || nums.length < 1) return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
