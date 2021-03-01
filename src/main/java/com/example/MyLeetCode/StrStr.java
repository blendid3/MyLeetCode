package com.example.MyLeetCode;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if(needle.equals("") ) return 0;
//        if(haystack ==  )

        for (int i = 0; i < haystack.length(); i++) {
            boolean getit = true;
            for(int j = 0; j < needle.length(); j++) {
                if(i + j >= haystack.length()) return -1;
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    getit = false;
                    break;
                }
            }
            if(getit) return i;
        }
        return -1;
    }
}
