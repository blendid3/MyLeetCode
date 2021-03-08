package com.example.GuidewireInterview;

import java.util.PriorityQueue;

public class Interview_1 {
    public int solution(int[] A) {
        // write your code in Java SE 8

        long curSum = 0;
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int val = A[i];
            q1.add(val);
            curSum += val;
            if (curSum < 0) {
                curSum -= q1.poll();
                count ++;
            }

        }
        return count;
    }

}
