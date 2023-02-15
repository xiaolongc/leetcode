package com.ik.top100.d0215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L47 {

    private int length;
    private final List<Worker> workers = new ArrayList<>();

    public class Worker {
        private Set<Integer> pathSet = new HashSet<>();
        private List<Integer> scope;
        private int scopeIdx;
        private final int idx;

        public Worker(int idx, int[] nums) {
            this.idx = idx;
            this.scope = new ArrayList<>();
            for (int i = idx; i < length; i++) {
                scope.add(nums[i]);
            }
        }

        public boolean pick(List<Integer> collector) {
            while (scopeIdx < scope.size()) {
                collector.set(idx, scope.get(scopeIdx));
                pathSet.add(scope.get(scopeIdx));
                if (idx < length - 1) {
                    if (workers.get(idx + 1).pick(collector)) {
                        return true;
                    }
                    while (++scopeIdx < scope.size()) {
                        if (pathSet.add(scope.get(scopeIdx))) {
                            List<Integer> nextScope = new ArrayList<>();
                            for (int i = 0; i < scope.size(); i++) {
                                if (i != scopeIdx) {
                                    nextScope.add(scope.get(i));
                                }
                            }
                            collector.set(idx, scope.get(scopeIdx));
                            workers.get(idx + 1).reset(nextScope);
                            return workers.get(idx + 1).pick(collector);
                        }
                    }
                    return false;
                }else{
                    scopeIdx++;
                    return true;
                }
            }
            return false;
        }

        private void reset(List<Integer> scope) {
            this.scope = scope;
            this.scopeIdx = 0;
            this.pathSet = new HashSet<>();
            if(this.idx < length -1){
                workers.get(idx + 1).reset(scope.subList(1, scope.size()));
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        this.length = nums.length;
        for (int i = 0; i < length; i++) {
            Worker worker = new Worker(i, nums);
            workers.add(worker);
        }
        List<List<Integer>> rs = new ArrayList<>();
        while (true) {
            List<Integer> r = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                r.add(0);
            }
            if (!workers.get(0).pick(r)) {
                return rs;
            }
            rs.add(r);
        }
    }
}
