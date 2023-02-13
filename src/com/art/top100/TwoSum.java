package com.art.top100;


import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[]  result = twoSum(nums,target);

        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap hashmap= new HashMap<Integer,Integer>();
        for (int i = 0; i<nums.length; i++ ){
            int mud = target-nums[i];
            if (hashmap.containsKey(mud)){
                return new int[]{ (int) hashmap.get(mud),i};
            }
            hashmap.put(nums[i],i);
        }
        return null;
    }
}
