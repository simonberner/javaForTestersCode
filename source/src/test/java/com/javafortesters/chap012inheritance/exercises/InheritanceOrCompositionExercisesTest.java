package com.javafortesters.chap012inheritance.exercises;

import com.javafortesters.domainentities.interim.composition.exercises.User;
import com.javafortesters.domainentities.interim.composition.exercises.UserStaticComposition;
import com.javafortesters.domainobject.TestAppEnv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InheritanceOrCompositionExercisesTest {

    @Test
    public void canComposeUserWithNewTestAppEnv() {
        User user = new User();
        assertEquals(user.getUrl(), TestAppEnv.getUrl());
    }

    @Test
    public void canComposeUserWithStaticTestAppEnv() {
        UserStaticComposition user = new UserStaticComposition();
        assertEquals(user.getUrl(), TestAppEnv.getUrl());
    }
}