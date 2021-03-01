package com.example.LeetCodeContent;

import java.util.Arrays;

public class Closest_Dessert_Cost2 {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int[] res = new int[]{Integer.MAX_VALUE};
        int[] sum = new int[]{0};
        for (int i = 0; i < baseCosts.length; i++) {
//            int res = target - baseCosts[0];
            sum[0] += baseCosts[i];
            recursive(target, toppingCosts, res, sum);
            sum[0] -= baseCosts[i];
        }
        return res[0] + target;
    }
    void recursive(int target, int[] toppingCosts, int[] res, int[] sum) {
        if (toppingCosts.length == 0) {
//            if (sum)
            if(Math.abs(sum[0] - target ) > res[0]) {
                return;
            } else if (Math.abs(sum[0] - target ) == res[0]){
                res[0] = sum[0] - target < 0? sum[0] - target: res[0];
            } else {
                res[0] = sum[0] - target;
            }
//            res[0] = Math.abs(sum[0] - target ) > res[0]? res[0]: sum[0] - target ;

            return;
        }
        for (int i = 0; i < 3; i++) {
            sum[0] += i * toppingCosts[0];
            recursive(target, Arrays.copyOfRange(toppingCosts, 1, toppingCosts.length), res, sum);
            sum[0] -= i * toppingCosts[0];
        }
    }
}
