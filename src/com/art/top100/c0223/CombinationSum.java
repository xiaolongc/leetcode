package com.art.top100.c0223;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {

        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2,3,5},8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0;i<candidates.length;i++){
            List<Integer> cur = new ArrayList<>();
            if (candidates[i]<=target){
                cur.add(candidates[i]);
                recall(candidates,cur,target-candidates[i],result);
            }
        }
        return result;
    }



    public void recall(int[] candidates,List<Integer> cur,int target,List<List<Integer>> res){
        //用tmp脱离cur引用关系
        List<Integer> tmp = new ArrayList<>();
        if (target==0){
            if (cur.size()>0){
                tmp.addAll(cur);
                res.add(tmp);
            }
            return;
        }
        for (int i=0;i<candidates.length;i++){
            if (candidates[i]<=target && candidates[i]>= cur.get(cur.size()-1)){
                cur.add(candidates[i]);
                recall(candidates,cur,target-candidates[i],res);
                //回溯要还原
                cur.remove(cur.size()-1);
            }else if (candidates[i]>target){
                return;
            }
        }
    }
}
