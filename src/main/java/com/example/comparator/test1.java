package com.example.comparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class test1 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;
                else if(o1 < o2)
                    return  -1;
                return 0;
            }
        };
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(comparator);
    }
}
