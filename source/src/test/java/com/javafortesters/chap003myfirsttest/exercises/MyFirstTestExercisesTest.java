package com.javafortesters.chap003myfirsttest.exercises;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTestExercisesTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals(4, answer, "2+2=4");
    }

    @Test
    public void canSubtractTwoFromTwo() {
        int answer = 2 - 2;
        assertEquals(0, answer, "2-2=0");
    }

    @Test
    public void canDivideFourByTwo() {
        int answer = 4 / 2;
        assertEquals(2, answer, "4/2=2");
    }

    @Test
    public void canMultiplyTwoByTwo() {
        int answer = 2 * 2;
        assertEquals(4, answer, "2*2=4");
    }
}