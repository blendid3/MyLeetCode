package com.example.MyLeetCode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int left = nums1.length - 1; int right = nums2.length - 1;
        for (int i = len - 1; i >=0 ; i--) {
            if(right < 0) {
                nums1[i] = nums1[left];
                left --;
            } else if(left < 0){
                nums1[i] = nums1[right];
                right --;
            } else {
                if(nums1[left] > nums2[right]) {
                    nums1[i] = nums1[left];
                    left --;
                } else {
                    nums1[i] = nums1[right];
                    right --;
                }
            }
        }
    }
}
