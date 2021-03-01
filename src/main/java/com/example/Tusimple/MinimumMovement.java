package com.example.Tusimple;

import java.util.List;

public class MinimumMovement {
    public static int minimumMovement(List<Integer> obstacleLanes) {
        // Write your code here
        int cur = 2;
//        int next = -1;
        int res = 0;
        int sum = 6;
        boolean conflict = false;
        for (int i = 0; i < obstacleLanes.size(); i++) {
            int val = obstacleLanes.get(i);
            if(conflict ) {
                if(val != cur){
                    cur = sum - cur - val;
                    conflict = false;
                }


            } else {
                if(val != cur) continue;
                else {
                    res ++;
                    conflict = true;
                }
            }

        }
        return  res;
    }
}
