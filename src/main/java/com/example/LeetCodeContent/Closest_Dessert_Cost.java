package com.example.LeetCodeContent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Closest_Dessert_Cost {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        Integer dif = Integer.MAX_VALUE;
        int[] difArr = new int[]{dif};
        List<Integer> toppingCostsList = new ArrayList();
        Arrays.stream(toppingCosts).forEach(value -> {toppingCostsList.add(value);});
        for (int i = 0; i < baseCosts.length; i++) {
            int res = target - baseCosts[i];
            if(res < 0) {
                difArr[0] = Math.abs(res) < difArr[0] ? res: difArr[0];
                continue;
            }
            getclosetCost(toppingCostsList,difArr  , res );

        }
        return target - difArr[0];
    }
    public void getclosetCost(List<Integer> toppingCostsList, int[] difArr, int res) {
        difArr[0] = Math.abs(res) < difArr[0] ? res: difArr[0];
        if(res < 0) {
            return;
        }
        else {
            for (int i = 0; i < toppingCostsList.size(); i++) {
                int val = toppingCostsList.get(i);
                toppingCostsList.remove(i);
                getclosetCost(toppingCostsList, difArr, res - val);
                toppingCostsList.add(i, val);
            }
        }
    }
}
