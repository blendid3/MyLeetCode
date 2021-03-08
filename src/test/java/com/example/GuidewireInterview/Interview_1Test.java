package com.example.GuidewireInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Interview_1Test {

    @Test
    void solution() {
        int[] arr = new int[] {-1, 3};
        assertEquals(new Interview_1().solution(arr), 1);
    }
}