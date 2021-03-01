package com.example.MyLeetCode;

public class CountPrimes {
    public int countPrimes(int n) {
        int[] arrPrimes = new int[n];
        if(n < 2) return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(arrPrimes[i] == 0 && isPrime(i)) {
                extendPrime(i, arrPrimes, n);
                count ++;
            }
        }
        return count;

    }
    void extendPrime(int prime, int[] arr, int limit) {
        int mul = 1;
        while (mul * prime < limit) {
            arr[mul * prime] = 1;
            mul ++;
        }
    }
    boolean isPrime(int n) {
        int left = 2;
        int right = n / 2;
        while(left <= right) {
            if(n % left == 0 ){
                return false;
            }
            left ++;
            right = n / left;
        }
        return true;
    }
    static CountPrimes getInstance() {return new CountPrimes();}
}
