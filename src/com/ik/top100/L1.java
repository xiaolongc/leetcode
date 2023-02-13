package com.ik.top100;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class L1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mapping.put(nums[i], i);
        }
        int[] rst = new int[2];
        for(int i=0; i<nums.length; i++){
            Integer tIdx = mapping.get(target - nums[i]);
            if(tIdx != null && i != tIdx){
                rst[0] = i;
                rst[1] = tIdx;
                return rst;
            }
        }
        return rst;
    }
}
