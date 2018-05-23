package com.javafortesters.chap016random.examples;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaUtilRandomTest {

    @Test
    public void generateRandomSyntaxExamples() {
        Random generate = new Random();

        // essentially code duplication to
        // demonstrate syntax in manuscript
        // result checked in the exercise tests

        boolean randomBoolean = generate.nextBoolean();
        int randomInt = generate.nextInt();
        int randomIntRange = generate.nextInt(12);
        long randomLong = generate.nextLong();
        double randomDouble = generate.nextDouble();
        double randomGaussian = generate.nextGaussian();
        byte[] bytes = new byte[generate.nextInt(100)];
        generate.nextBytes(bytes);  // fill bytes with random data

        assertNotNull(generate);
    }


    @Test
    public void generateRandomIntRange() {
        Random generate = new Random();
        int rir;

        rir = generate.nextInt(5);
        assertThat(rir >= 0 && rir < 5, is(true));
        rir = generate.nextInt(200);
        assertThat(rir >= 0 && rir < 200, is(true));
        rir = generate.nextInt(4000);
        assertThat(rir >= 0 && rir < 4000, is(true));
    }


    @Test
    public void generateRandomIntGivenRangeNot0() {
        Random generate = new Random();

        int minValue = 1;
        int maxValue = 5;
        int randomIntRange = generate.nextInt(
                maxValue - minValue + 1) + minValue;

        assertThat(randomIntRange <= maxValue, is(true));
        assertThat(randomIntRange >= minValue, is(true));
    }


    @Test
    public void canGenerateAgeUsingDeviation() {

        Random generate = new Random();


        int age = (int) (generate.nextGaussian() * 5) + 35;

        if (age < 15)
            age = 15;

        if (age > 55)
            age = 55;

        // dangerous assertions as the test might fail,
        // hence the max and min above
        assertTrue(age > 14);
        assertTrue(age < 56);
    }


    @Test
    public void canGenerateRandomNumbersWithSeedExample() {
        Random generate = new Random(1234567L);
        assertThat(generate.nextInt(), is(1042961893));
    }

    @Test
    public void canSeedWithCurrentDateTime() {
        long currentSeed = System.currentTimeMillis();
        System.out.println("seed used: " + currentSeed);
        Random generate = new Random(currentSeed);

        int prevInt = generate.nextInt();
        System.out.println(generate.nextInt());

        Random generateAgain = new Random(currentSeed);
        assertThat(generateAgain.nextInt(), is(prevInt));
    }


    @Test
    public void generateARandomCharExample() {

        String validValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        Random random = new Random();

        int rndIndex = random.nextInt(validValues.length());
        char rChar = validValues.charAt(rndIndex);

        if (rChar != ' ') {
            assertTrue(rChar >= 'A');
            assertTrue(rChar <= 'Z');
        }
    }


}