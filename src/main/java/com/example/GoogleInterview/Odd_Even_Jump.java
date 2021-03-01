package com.example.GoogleInterview;

public class Odd_Even_Jump {
    public int oddEvenJumps(int[] arr) {
        boolean[] oddArr = new boolean[arr.length];
        boolean[] evenArr = new boolean[arr.length];
        oddArr[arr.length - 1] = true; evenArr[arr.length - 1] = true;
        for (int i = arr.length - 2; i >= 0 ; i--) {
            // odd Array
            int val = arr[i];
            int minDex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] > val && arr[j] < minValue) {
                    minValue = arr[j];
                    minDex = j;
                }
            }
//            oddArr[]
            if (minDex == -1) oddArr[i] = false;
            else oddArr[i] = evenArr[minDex];

            // even Array
            int maxDex = - 1;
            int maxValue = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < val && arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxDex = j;
                }
            }
            if (maxDex == -1) evenArr[i] = false;
            else evenArr[i] = oddArr[maxDex];


        }
//        return oddArr[0];
        int count = 0;
        for (int i = 0; i < oddArr.length; i++) {
            if (oddArr[i]) count ++;
        }
        return count;
    }

}
