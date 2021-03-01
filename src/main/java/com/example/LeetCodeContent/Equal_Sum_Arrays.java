package com.example.LeetCodeContent;

import java.util.*;

public class Equal_Sum_Arrays {
    public int minOperations(int[] nums1, int[] nums2) {
        int val1 = Arrays.stream(nums1).sum();
        int val2 = Arrays.stream(nums2).sum();
        if(val1 == val2) return 0;
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else if(o1 < o2)
                    return  1;
                return 0;
            }
        };

        PriorityQueue<Integer> minusArray = new PriorityQueue<Integer>(comparator1);

        int[] sumChange = new int[]{0};
        int dif = Math.abs(val1 - val2);
        if (val1 > val2) {
            Arrays.stream(nums1).forEach(value -> {minusArray.add(value - 1); sumChange[0] += value - 1;});
            Arrays.stream(nums2).forEach(value -> {minusArray.add(6 - value);sumChange[0] += 6 - value; });

        } else {
            Arrays.stream(nums1).forEach(value -> {minusArray.add(value - 1);sumChange[0] += value - 1;});
            Arrays.stream(nums2).forEach(value -> {minusArray.add(6 - value); sumChange[0] += 6 - value;});
        }
        if (sumChange[0] < dif) {
            return -1;
        }
        int op = 0;
        while (dif > 0) {
            dif -= minusArray.poll();
            op++;
        }
        return op;

    }
}
