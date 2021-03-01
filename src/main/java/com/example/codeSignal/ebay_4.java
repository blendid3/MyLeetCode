package com.example.codeSignal;

public class ebay_4 {
    long concatenationsSum(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                String str1 = String.valueOf(a[i]) + String.valueOf(a[j]);
                sum += Long.valueOf(str1);
            }
        }
        return sum;

    }

}
