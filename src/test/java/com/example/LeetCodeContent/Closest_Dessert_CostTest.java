package com.example.LeetCodeContent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Closest_Dessert_CostTest {

    @Test
    void closestCost() {
        Closest_Dessert_Cost t1 = new Closest_Dessert_Cost();
        assertEquals(t1.closestCost(new int[] {1, 7}, new int[]{3, 4}, 10) , 4);
    }
}