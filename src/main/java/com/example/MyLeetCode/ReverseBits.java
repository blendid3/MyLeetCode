package com.example.MyLeetCode;

public class ReverseBits {
    public static int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder bud = new StringBuilder(str);
        String res = bud.reverse().toString();
        return Integer.getInteger(res);
    }
}
