package com.example.ResMedInterview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_ParenthesesTest {

    @Test
    void validParentheses() {
        assertEquals(Valid_Parentheses.validParentheses("([)]"), 3);
        ;
    }
}