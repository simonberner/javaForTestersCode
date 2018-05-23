package com.javafortesters.chap007basicsofjavarevisited.examples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementsTest {

    @Test
    public void statements() {

        assertEquals(4, 2 + 2);

        assertEquals(4, 2 + 2, "2+2 always = 4");

    }
}