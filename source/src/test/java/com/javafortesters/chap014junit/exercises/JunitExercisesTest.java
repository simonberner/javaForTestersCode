package com.javafortesters.chap014junit.exercises;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class JunitExercisesTest {

    @Test
    public void junitHasAssertions() {
        assertEquals(6, 3 + 3);
        assertEquals(6, 3 + 3, "3 + 3 = 6");

        assertFalse(false, "false is false");
        assertFalse(false);

        assertTrue(true, "true is true");
        assertTrue(true);

        int[] oneTo10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tenToOne = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(tenToOne);
        assertArrayEquals(oneTo10, tenToOne);

        assertNotNull("An empty string is not null", "");
        assertNotNull("");

        assertNotSame("An empty string is not null", null, "");
        assertNotSame(null, "");

        assertNull(null, "Only null is null");
        assertNull(null);

        assertSame(null, null, "Only null is null");
        assertSame(null, null);
    }


    @Test
    public void assertThatWithHamcrestMatchers() {

        assertThat(3 + 3, is(6));

        /* failing assert used to generate message in book
        assertThat(3 + 3, is(7));
        */

        assertThat("3 + 3 = 6", 3 + 3, is(6));

                /* failing assert used to generate message in book
        assertThat("3 + 3 = 6", 3 + 3, is(7));
        */

        assertThat("false is false", false, equalTo(false));
        assertThat(false, is(false));

        assertThat("true is true", true, equalTo(true));
        assertThat(true, is(true));

        int[] oneTo10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tenToOne = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(tenToOne);
        assertThat(oneTo10, equalTo(tenToOne));

        assertThat("An empty string is not null", "",
                is(not(nullValue())));
        assertThat("", is(not(nullValue())));
        assertThat("", is(notNullValue()));

        assertThat("Only null is null", null, is(nullValue()));
        assertThat(null, nullValue());
    }


    @Test
    public void useTheListedHamcrestMatchers() {

        assertThat(3, is(equalTo(3)));
        assertThat(3, is(not(4)));
        assertThat("This is a string", containsString("is"));
        assertThat("This is a string", endsWith("string"));
        assertThat("This is a string", startsWith("This is"));
    }

}