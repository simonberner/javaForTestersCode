package com.javafortesters.chap004testswithotherclasses.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Book Java For Tester: Page 46
public class IntegerExercisesTest {

    @Test
    public void convertIntToHex() {
        assertEquals("b", Integer.toHexString(11), "hex value of 11 is b");
        assertEquals("a", Integer.toHexString(10), "hex value of 10 is a");
        assertEquals("3", Integer.toHexString(3), "hex value of 3 is 3");
        assertEquals("15", Integer.toHexString(21), "hex value of 21 is 15");
    }

    @Test
    public void confirmMaxAndMinInteger() {
        assertEquals(Integer.MAX_VALUE, 2147483647, "confirm MAX Integer size");
        assertEquals(Integer.MIN_VALUE, -2147483648, "confirm MIN Integer size");
    }
}
