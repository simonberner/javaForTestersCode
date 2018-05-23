package com.javafortesters.chap003myfirsttest.examples.naming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNameClass {
    @Test
    public void whenClassHasTestAtFrontThenTestIsRun() {
        // this test will run from maven so it needs to pass
        assertTrue(true, "whenClassHasTestAtFrontThenTestIsRun");
    }
}
