package com.example.BackTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FactorCombinations {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> curList = new LinkedList();
        backTracking(res, curList, n, 2);
        res.remove(res.size() - 1);
        return res;
    }
    public void backTracking(List<List<Integer>> res, LinkedList<Integer> curList, int remain, int beg) {
        if (remain == 1) res.add(new ArrayList<>(curList));
        if ( beg > remain) {
            return;
        }
        for (int i = beg; i <= remain ; i++) {
            if (remain % i != 0) continue;
            curList.add(i);
            backTracking(res, curList, remain / i, i);
            curList.removeLast();
        }
    }
    public static FactorCombinations createInstace() {
        return new FactorCombinations();
    }
}
