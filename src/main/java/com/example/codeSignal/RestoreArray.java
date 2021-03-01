package com.example.codeSignal;

import java.util.*;

public class RestoreArray {
    int[] restoreArray(int[][] pairs) {
        Set<Integer> HeaderSet = new HashSet<>();
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < pairs.length; i++) {
            int val1 = pairs[i][0];
            int val2 = pairs[i][1];
            if(!map1.containsKey(val1)) {
                map1.put(val1, new ArrayList<Integer>());
            }
            if(!map1.containsKey(val2)) {
                map1.put(val2, new ArrayList<Integer>());
            }
            map1.get(val1).add(val2); map1.get(val2).add(val1);

            if(!HeaderSet.contains(val1)) {
                HeaderSet.add(val1);
            } else {
                HeaderSet.remove(val1);
            }

            if(!HeaderSet.contains(val2)) {
                HeaderSet.add(val2);
            } else {
                HeaderSet.remove(val2);
            }
        }
        int[] res = new int[map1.size()];
        res[0]= (int)HeaderSet.stream().toArray()[0];
        res[res.length - 1]= (int)HeaderSet.stream().toArray()[1];
        int cur = res[0];
        for (int i = 1; i < res.length - 1; i++) {
            map1.get(cur).remove(cur);
            int val = map1.get(cur).get(0);
            res[i] = val;
        }
        return res;
    }

}
