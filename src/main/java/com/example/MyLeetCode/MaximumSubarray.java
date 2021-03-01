package com.example.MyLeetCode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
//        int[] dynamArr = new int[nums.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            sum = val + sum;
            if(sum < 0) {
                sum = 0;
                if(val > max ) {
                    max = val;
                }
            }
            else if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
    static MaximumSubarray getInstance() {
        return new MaximumSubarray();
    }

}
