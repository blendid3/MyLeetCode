package com.example.MyLeetCode;
//import Random

import java.util.Random;

public class Solution {
    int[] origin;
    Random rand = new Random();
    public Solution(int[] nums) {
        origin = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
//        newArray
    }
    public void swap(int i, int j, int[] arr) {
        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
    int randRange(int beg, int end) {
        return rand.nextInt(end - beg)  + beg;
    }
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] newArray = origin.clone();
        for (int i = 0; i < newArray.length; i++) {
            swap(i, randRange(i, newArray.length), newArray);
        }
        return newArray;
    }
}
