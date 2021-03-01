package com.example.codeSignal;
import java.util.*;

public class ebay_3 {
    int[][] meanGroups(int[][] a) {
        Set<Double> set1 = new HashSet<>();
        Map<Double, List<Integer>>map1 = new HashMap();
        for (int i = 0; i < a.length; i++) {
            int val = 0;
            for (int j = 0; j < a[i].length; j++) {
                val += a[i][j];
            }
            double mean = (double)val / a[i].length;
            if(!map1.containsKey(mean)) {
                set1.add(mean);
                map1.put(mean, new ArrayList<>());
            }
            map1.get(mean).add(i);
        }
        int[][] res = new int[set1.size()][];
        for (int i = 0; i < set1.size(); i++) {

            double mean = (double)set1.stream().toArray()[i];
            res[i] = new int[map1.get(mean).size()];
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = map1.get(mean).get(j);
            }
        }
        return res;
//        int[] sumList = new int[a.length];
//        for (int i = 0; i < a.length ; i++) {
//            int val = 0;
//            for (int j = 0; j < a[i].length; j++) {
//                val += a[i][j];
//            }
//            sumList[i] = val;
//        }
//        Map
    }

}
