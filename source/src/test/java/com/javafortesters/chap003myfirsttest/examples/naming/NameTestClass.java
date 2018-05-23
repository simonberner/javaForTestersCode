package com.javafortesters.chap003myfirsttest.examples.naming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameTestClass {
    @Test
    public void whenClassHasTestInMiddleThenTestIsNotRun() {
        // this test will not run from maven so i can make
        // a failing test... it fails in the IDE
        assertTrue(false, "whenClassHasTestInMiddleThenTestIsNotRun");
    }
}
