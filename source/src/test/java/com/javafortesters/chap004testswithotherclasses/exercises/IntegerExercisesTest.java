package com.javafortesters.chap004testswithotherclasses.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerExercisesTest {

    @Test
    public void convertIntToHex() {
        assertEquals("b", Integer.toHexString(11), "hex value of 11 is b");

    }
}
