package com.example.MyLeetCode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        int sumOfSet = 0;
        int sumOfNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!s1.contains(nums[i])) {
                sumOfSet += nums[i];
                s1.add(nums[i]);
            }
            sumOfNums += nums[i];
        }
        return sumOfSet*2 - sumOfNums;

    }
    static SingleNumber getInstance() {
        return new SingleNumber();
    }
}
