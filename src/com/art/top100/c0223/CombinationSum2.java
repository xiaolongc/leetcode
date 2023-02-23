package com.art.top100.c0223;

import java.util.*;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<String> set = new HashSet<>();
        for (int i=0;i<candidates.length;i++){
            List<Integer> cur = new ArrayList<>();
            List<Integer> index = new ArrayList<>();
            if (candidates[i]<=target){
                cur.add(candidates[i]);
                index.add(i);
                recall(candidates,cur,target-candidates[i],result,set,index);
            }
        }
        return result;
    }



    public void recall(int[] candidates, List<Integer> cur, int target, List<List<Integer>> res, Set set, List<Integer> index){
        if(!set.contains(cur.toString())){
            set.add(cur.toString());
        }else{
            return;
        }
        //用tmp脱离cur引用关系
        List<Integer> tmp = new ArrayList<>();
        if (target==0){
            if (cur.size()>0){
                tmp.addAll(cur);
                res.add(tmp);
            }
            return;
        }
        for (int i=index.get(index.size()-1);i<candidates.length;i++){
            if (candidates[i]<=target  && i>index.get(index.size()-1) ){
                cur.add(candidates[i]);
                index.add(i);
                recall(candidates,cur,target-candidates[i],res,set,index);
                //回溯要还原
                cur.remove(cur.size()-1);
                index.remove(index.size()-1);
            }else if (candidates[i]>target){
                return;
            }
        }
    }
}

