package com.example.MyLeetCode;

public class LongestCommonPrefix {
    // method 1
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0) return "";
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            prefix = iteratePrefix(prefix, strs[i]);
//            if(prefix.equals(""))
//                break;
//        }
//        return prefix;
//    }
//    private String iteratePrefix(String str1, String str2) {
//        int pointer1 = 0;
//        int pointer2 = 0;
//        StringBuilder res = new StringBuilder();
//        while(pointer1 < str1.length() && pointer2 < str2.length()) {
//
//            if(str1.charAt(pointer1) != str2.charAt(pointer2)) {
//                break;
//            } else {
//                res.append(str1.charAt(pointer1));
//            }
//            pointer1 ++;
//            pointer2 ++;
//        }
//        return res.toString();
//    }
    // vertical compare
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0 ) return "";
//        String prefix = strs[0];
//        for(int i = 0; i < prefix.length(); i++) {
//            char lett = prefix.charAt(i);
//            for(int j = 1; j < strs.length; j++) {
//                if (strs[j].length() <= i ||strs[j].charAt(i) != lett) {
//                    return prefix.substring(0, i);
//                }
//            }
//        }
//        return prefix;
//    }
    //
    public String longestCommonPrefix(String[] strs) {
        return conquerAndDivide(strs, 0, strs.length);
    }
    public String conquerAndDivide(String[] strs, int beg, int end) {
        if(beg == end) return "";
        if(beg == end - 1) return strs[beg];
        int mid = (beg + end) / 2;
        return getprefix(conquerAndDivide(strs, beg, mid),  conquerAndDivide(strs, mid, end));
    }
    public String getprefix(String str1, String str2) {
        int len = str1.length();
        while(len > 0) {
            String strTmp = str1.substring(0, len);
            if(str2.indexOf(strTmp) != 0) {
                len --;
            } else {
                return strTmp;
            }
        }
        return "";

    }


}
