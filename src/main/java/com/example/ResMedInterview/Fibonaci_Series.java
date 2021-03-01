package com.example.ResMedInterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Fibonaci_Series {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line ;
        while ((line = in.readLine()) != null) {
            int val = Integer.parseInt(line);

            System.out.println(Fibonaci(val));
        }
    }
    static int Fibonaci(int val) {
        if(val ==  0) return  0;
        if (val == 1) return  1;
        return Fibonaci(val - 1) + Fibonaci(val - 2);
    }
}
