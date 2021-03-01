package com.example.BackTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> curList = new LinkedList<>();
        backTracking(res, curList, 1, n, k);
        return res;
    }
    void backTracking(List<List<Integer>> res, LinkedList<Integer> curList, int begin, int remain, int size) {
        if(curList.size() == size && remain == 0) {
            res.add(new ArrayList<>(curList));
            return;
        }
        if(curList.size() ==  size || remain < 0) {
            return;
        }
        for (int i = begin; i <= (remain > 9? 9: remain); i++) {
            curList.add(i);
            backTracking(res, curList, i + 1, remain - i, size);
            curList.removeLast();
        }
    }
    static CombinationSum3 createInstance() {
        return new CombinationSum3();
    }
}
