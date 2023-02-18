package com.art.top100.c0218;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int result = nums.length;
        if (nums.length<2) return result;
        int i = 0,j=1;
        while (i<nums.length-1 && j<nums.length ){
            if (nums[i]==nums[j]){
                result--;
            }else {
                i=j;
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0,0,0,1}));
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1,1,2}));

    }
}
