package com.example.Tusimple;

public class GroupOptions {
    public static long countOptions(int people, int groups) {
        // Write your code here
        long[] res = new long[] {0};
        recursive(people, groups, res, 1);
        return res[0];
    }
    public static void recursive(int people, int groups, long[] res, int numBeg) {
        if (people < numBeg) return;
        if (groups == 1) {
            res[0] ++;
            return;
        }
        int end = people / groups;
        for (int i = numBeg; i <= end ; i++) {
//            if (people - i )
            recursive(people - i, groups - 1, res, i);
        }
    }
}
