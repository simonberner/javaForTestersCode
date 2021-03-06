package com.javafortesters.chap017_datestimes.examples;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest {

    @Test
    public void currentTimeMillis() {
        long startTime = System.currentTimeMillis();

        for (int x = 0; x < 10; x++) {
            System.out.println("Current Time " +
                    System.currentTimeMillis());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void createAUniqueUserID() {

        String userID = "user" + System.currentTimeMillis();

        System.out.println(userID);
        assertTrue(userID.startsWith("user"));
        assertTrue(Long.valueOf(userID.replace("user", "")) > 1000L);
    }
}