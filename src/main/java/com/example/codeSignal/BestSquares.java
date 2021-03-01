package com.example.codeSignal;
//import javafx.util.Pair;

import java.util.*;

public class BestSquares {
    int bestSquares(int[][] m, int k) {
        Map<Integer, List<int[]>> map1 = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m.length - k + 1; i++) {
            for (int j = 0; j < m[i].length - k + 1; j++) {

                int sum = 0;
                for (int l = i; l < i + k; l++) {
                    for (int n = j; n < j + k; n++) {
                        sum += m[l][n];
                    }
                }
                if(!map1.containsKey(sum)) {
                    map1.put(sum, new ArrayList<>());
                }
                if(sum > max) max = sum;
                int[] pos = new int[]{i, j};
                map1.get(sum).add(pos);
            }
        }
        List<int[]> l1 = map1.get(max);
        Set<Integer> set1 = new HashSet<>();
        int res = 0;
        for (int i = 0; i < l1.size(); i++) {
            int[] pos = l1.get(i);

            for (int l = pos[0]; l < pos[0] + k; l++) {
                for (int n = pos[1]; n < pos[1] + k; n++) {
                    int val = m[l][n];
                    if(!set1.contains(val)) {
                        set1.add(val);
                        res += val;
                    }
                }
            }


        }
        return res;
    }
}
