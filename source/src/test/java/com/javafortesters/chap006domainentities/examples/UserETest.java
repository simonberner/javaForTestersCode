package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.UserE;
import org.junit.jupiter.api.Test;

public class UserETest {

    @Test
    public void canWeConstructANewUser() {
        UserE user = new UserE();

        System.out.println("User successfully instatiated");


    }

     /*
        simplify your ifs
        variable = (conditionToBeTrue) ? valueWhenTrue : valueWhenFalse

        not necessary because it anyway return a boolean of true/false!
        if (somethingThatEvaluatesAsBoolean is true) {
        return true
        } else {
        return false
        }

        Proper console output: print test data

         */


}
