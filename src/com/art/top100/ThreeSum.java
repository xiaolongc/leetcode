package com.art.top100;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

//        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0,0,0}));
    }

    /**
     * 解答成功:
     * 	执行耗时:694 ms,击败了5.01% 的Java用户
     * 	内存消耗:50.3 MB,击败了5.01% 的Java用户
     *
     * 	2333333
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length<2) return res;
        //快排
        Arrays.sort(nums);
        HashMap<Integer, List> hashMap = new HashMap();
        Set set = new HashSet();
        for (int m = 0; m < nums.length; m++) {
            List arr= new ArrayList<Integer>();
            if (hashMap.containsKey(nums[m])){
                arr=hashMap.get(nums[m]);
            }
            if (arr.size()>2) continue;
            arr.add(m);
            hashMap.put(nums[m],arr);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; i < j; j--) {
                int targe = 0 - nums[j] - nums[i];
                if (hashMap.containsKey(targe)) {
                    List<Integer> taarr = hashMap.get(targe) ;
                    for (int targeIndex :taarr){
                        if (targeIndex<j && targeIndex>i&&!set.contains(nums[i]+""+targe+""+nums[j])){
                            List<Integer> resList = new ArrayList<>();
                            set.add(nums[i]+""+targe+""+nums[j]);
                            resList.add(nums[i]);
                            resList.add(nums[j]);
                            resList.add(targe);
                            res.add(resList);
                        }
                    }

                }
            }
        }
        return res;
    }




}
