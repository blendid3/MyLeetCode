package com.example.codeSignal;

public class ebay_1 {
    int[] mutateTheArray(int n, int[] a) {
        int[] b = new int[n];
        int first = 0; int second = 0; int third = 0;
        for (int i = 0; i < n; i++) {
            first = i - 1 < 0 ? 0: a[i - 1]; third = i + 1 >= n? 0: a[i + 1];

            b[i] = first + a[i] + third;
        }
        return b;
    }
}
