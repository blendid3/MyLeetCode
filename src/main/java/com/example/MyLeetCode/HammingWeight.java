package com.example.MyLeetCode;

public class HammingWeight {
    public static int hammingWeight(int n) {
        String str1 = Integer.toBinaryString(n);
        return (int)str1.chars().mapToObj(item -> (char)item).filter(item -> item == '1').count();
//        int bits = 0;
//        int mask = 1;
//        for (int i = 0; i < 32; i++) {
//            if ((n & mask) != 0) {
//                bits++;
//            }
//            mask <<= 1;
//        }
//        return bits;
    }
}
