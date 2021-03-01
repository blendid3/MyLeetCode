package com.example.codeSignal;

public class SumOfReversed {

    long sumOfReversed(int[] arr) {
        long res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Reversed(arr[i]);
        }
        return res;
    }
    long Reversed(int val) {
        String str1 = String.valueOf(val);
        boolean flag = false;
        long res = 0;
        int mult = 1;
        for (int i = str1.length() - 1; i >= 0 ; i--) {
            if(flag == false && str1.charAt(i) == '0') {
                mult *= 10;
            } else {
                flag = true;
                int val1 = (int)(str1.charAt(i) - '0');
                res = res * 10 + val1;
            }
        }
        res = res * mult;
        return res;
    }
}
