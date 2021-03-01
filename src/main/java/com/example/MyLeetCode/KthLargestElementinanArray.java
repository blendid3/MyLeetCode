package com.example.MyLeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        Arrays.stream(nums).sequential().forEach(item -> {q1.add(item);});
        for (int i = 0; i < k - 1; i++) {
            q1.poll();
        }
        return q1.poll();
    }
}
