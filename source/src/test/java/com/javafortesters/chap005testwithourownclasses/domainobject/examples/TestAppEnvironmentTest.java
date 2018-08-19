package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {

        assertEquals("http://192.123.0.3:67", TestAppEnv.getUrl(), "Returns Hard Coded URL");
    }

    @Test
    public void canGetDomainAndPortStatically() {

        assertEquals("192.123.0.3", TestAppEnv.DOMAIN, "Just the Domain");
        assertEquals("67", TestAppEnv.PORT, "Just the port");
    }
}
