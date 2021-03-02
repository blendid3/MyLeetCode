package com.example.Tusimple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupOptionsTest {

    @Test
    void countOptions() {
        assertEquals(GroupOptions.countOptions(8, 4), 5);
    }
}