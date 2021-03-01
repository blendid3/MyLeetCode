package com.example.codeSignal;

public class ebay_2 {
    int countTinyPairs(int[] a, int[] b, int k) {
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            String str1 = String.valueOf(a[i]);
            String str2 = String.valueOf(b[len - i - 1]);
            String str3 = str1 + str2;
            int val = Integer.valueOf(str3);
            if(val < k) count++;
        }
        return count;
    }

}
