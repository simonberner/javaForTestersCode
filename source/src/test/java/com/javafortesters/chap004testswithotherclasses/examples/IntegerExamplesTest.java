package com.javafortesters.chap004testswithotherclasses.examples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals(4, four.intValue(), "intValue returns int 4");

        Integer five = new Integer("5");
        assertEquals(5, five.intValue(), "intValue returns int 5");

        // Autoboxing will automatically convert from a primitive type to the associated class automatically.
        Integer six = 6;
        assertEquals(6, six.intValue(), "intValue returns int 6");
    }
}
