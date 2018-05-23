package com.javafortesters.chap003myfirsttest.examples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTestDifferentAsserts {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals(4, answer);
    }
}