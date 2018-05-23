package com.javafortesters.chap006domainentities.exercises.nothiserror;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {


    //@Test(expected=AssertionError.class)
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pA55w0rD");
        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pA55w0rD",
                user.getPassword());
    }
}