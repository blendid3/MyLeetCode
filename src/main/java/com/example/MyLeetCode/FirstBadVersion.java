package com.example.MyLeetCode;

public class FirstBadVersion {
//    public int firstBadVersion(int n) {
//        int beg = 1; int end = n + 1;
//        return rec(beg, end);
//    }
//    int rec(int beg, int end) {
//        int mid =( beg + end ) / 2;
//        if(isBadVersion(beg)) return beg;
//        if(!isBadVersion(end - 1)) return end;
//        if(isBadVersion(mid)) {
//            return rec(beg, mid);
//        } else {
//            return rec(mid + 1, end);
//        }
//    }
//public int firstBadVersion(int n) {
//    int beg = 1; int end = n + 1;
//    while(beg < end) {
//        if(isBadVersion(beg)) return beg;
//        if(!isBadVersion(end - 1)) return end;
//        int mid =( beg + end ) / 2;
//        if(isBadVersion(mid)) {
////            return rec(beg, mid);
//             end = mid;
//        } else {
//            beg = mid + 1;
////            return rec(mid + 1, end);
//        }
//    }
//    return -1;
//}

}
