package com.javafortesters.chap012inheritance.exercises;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvironmentUserTest {

    @Test
    public void createAnEnvironmentUser() {
        EnvironmentUser enuser = new EnvironmentUser();

        assertEquals("username", enuser.getUsername());
        assertEquals("http://192.123.0.3:67", enuser.getUrl());
    }
}