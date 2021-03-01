package com.example.MyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class generate {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        recurDown(res, 2, numRows);
        return res;
    }
    static void recurDown(List<List<Integer>> res, int curRows, int numRows) {
        if (curRows > numRows) return ;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> preList = res.get(curRows - 2);
        l1.add(preList.get(0));
        for (int i = 1; i < preList.size(); i++) {
            l1.add(preList.get(i) + preList.get(i - 1));
        }
        l1.add(preList.get(preList.size()- 1) );
        res.add(l1);
        recurDown(res, curRows + 1, numRows);
    }
}
