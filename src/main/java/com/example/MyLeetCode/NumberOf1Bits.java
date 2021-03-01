package com.example.MyLeetCode;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        String str1 = String.valueOf(n);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '1') {
                count ++;
            }
        }
        return count;
    }
}
