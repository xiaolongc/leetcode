package com.ik.top100.d0214;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class L15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> idxMapping = new HashMap<>();
        List<List<Integer>> rs = new ArrayList<>();
        Set<String> filter = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            idxMapping.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Integer k = idxMapping.get(-nums[i] - nums[j]);
                if (k == null || k == i || k == j) {
                    continue;
                }
                int v0, v1, v2;
                if (nums[i] > nums[j]) {
                    if (nums[j] > nums[k]) {
                        v0 = nums[k];
                        v1 = nums[j];
                        v2 = nums[i];
                    } else {
                        if (nums[k] > nums[i]) {
                            v0 = nums[j];
                            v1 = nums[i];
                            v2 = nums[k];
                        } else {
                            v0 = nums[j];
                            v1 = nums[k];
                            v2 = nums[i];
                        }
                    }
                } else {
                    if (nums[k] > nums[j]) {
                        v0 = nums[i];
                        v1 = nums[j];
                        v2 = nums[k];
                    } else {
                        if (nums[i] > nums[k]) {
                            v0 = nums[k];
                            v1 = nums[i];
                            v2 = nums[j];
                        } else {
                            v0 = nums[i];
                            v1 = nums[k];
                            v2 = nums[j];
                        }
                    }
                }
                if (!filter.add(v0 + " " + v1)) {
                    continue;
                }
                List<Integer> r = new ArrayList<>();
                r.add(v0);
                r.add(v1);
                r.add(v2);
                rs.add(r);
            }
        }
        return rs;
    }

}
