package com.example.GuidewireInterview;

public class Interview_2 {
    public int solution(int M, int N) {
        // write your code in Java SE 8
        int area = M + N * 4;
        int line = (int) Math.sqrt(area);

        while (line >= 1) {
            int NMax = (int) Math.pow((line / 2) , 2);
            int MMin = (int)(Math.pow(line, 2)) - NMax * 4;
            int MinTmp = MMin;
            for (int i = NMax; i >=0 ; i--) {
                if (N >= i && M >= MinTmp) {
                    return line;
//            NMax = (int) Math.pow((line / 2) , 2);
                }
                MinTmp += 4;
            }
            line --;
        }

            return line ;
    }
}
