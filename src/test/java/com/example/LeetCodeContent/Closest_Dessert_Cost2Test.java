package com.example.LeetCodeContent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Closest_Dessert_Cost2Test {

    @Test
    void closestCost() {
        assertEquals(new Closest_Dessert_Cost2().closestCost(new int[]{1,7}, new int[] {3, 4}, 10), 10);
    }
}