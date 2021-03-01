package com.example.MyLeetCode;

public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2)  return nums[0] > nums[1] ? nums[0]: nums[1];
        int[] maxVal = new int[nums.length];
        maxVal[0] = nums[0]; maxVal[1] = nums[0] > nums[1] ? nums[0]: nums[1];
        for (int i = 2; i < maxVal.length; i++) {
            maxVal[i] = maxVal[i - 1] > (maxVal[i - 2] + nums[i]) ? maxVal[i - 1] : (maxVal[i - 2] + nums[i]);
        }
        return maxVal[nums.length - 1];
    }
    static HouseRobber getInstance() {
        return new HouseRobber();
    }
}
