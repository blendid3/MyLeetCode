package com.example.MyLeetCode;

public class PowerOfThree {
    public static  boolean isPowerOfThree(int n) {
//        int a = Math.abs(n);
//        if(a == 1) return true;
        if(n == 0) return false;

        while (Math.abs(n) != 1) {
            if(n % 3 != 0) {
                return false;
            } else {
                n /=  3;
            }
        }
        return true;
    }
}
