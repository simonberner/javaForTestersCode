package com.javafortesters.chap009arraysiteration.exercises;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExercisesTest1 {

    // Inner class which is useful for creating some test data
    private class User {

        private String username;
        private String password;

        private User(String username, String password) {
            this.username = username;
            this.password = password;

        }

    }

    // Page 123
    @Test
    public void create100UserArray() {

        User[] users = new User[100];
        // Find a way to check if the array was created
        assertEquals(100, users.length);

        for (int i = 0; i < users.length; i++) {

            String username = "user" + i;
            String password = "password" + i;

            users[i] = new User(username, password);

            // Find a way to check if the array was created
            System.out.print(users[i].username + ", ");
            System.out.print(users[i].password);
            System.out.println("");

            // For bonus points, write some code to assert that the array was filled properly.
            assertEquals(username, users[i].username);
            assertEquals(password, users[i].password);
        }

    }

    // Page 128
    @Test
    @DisplayName("Sort a string array of workdays and verify them")
    public void sortWorkdays() {
        /*
        With strings remember that uppercase letters have lower Unicode values than lowercase letters,
        that's why monday is at the last index in the workdays array
         */
        String[] workdays = {"monday", "Tuesday", "Wednesday", "Thursday",
                "Friday"};

        Arrays.sort(workdays);

        // Print the array by using a For Each loop
        int arrayIndex = 0;
        for (String workday : workdays) {
            System.out.print("found " + workday + " at index " + arrayIndex);
            System.out.println("");
            arrayIndex++;
        }


        //Assert that the order of values in the array are as you expect.
        //assertEquals("Friday", workdays[0]);
        //assertEquals("Monday", workdays[1]);
        Approvals.verifyAll("", workdays);

    }

    // Page 132
    @Test
    @DisplayName("Create a triangle and printout")
    public void createTriangle() {
        int[][] raggedArray = new int[16][];

        for (int indexArray = 0; indexArray < raggedArray.length; indexArray++) {
            raggedArray[indexArray] = new int[indexArray];
            for (int arrayValue = 0; arrayValue < indexArray; arrayValue++) {
                raggedArray[indexArray][arrayValue] = arrayValue;
            }
        }
        print2DIntArray(raggedArray);

    }

    private void print2DIntArray(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    // Page 155
    @Test
    @DisplayName("Manipulate a collection of users")
    public void manipulateUsers() {

        //Create a Collection of Users
        Collection<User> userCollection = new ArrayList<>();

        //Assert that the size()==0 and isEmpty()==true
        //Approvals.verify(userCollection);
        assertEquals(0, userCollection.size());
        assertEquals(true, userCollection.isEmpty());

        //Create two User objects
        User user1 = new User("username1", "1");
        User user2 = new User("username2", "2");

        //Add the User objects to the collection
        userCollection.add(user1);
        userCollection.add(user2);

        //Assert that the size()==2 and isEmpty()==false
        Approvals.verify(userCollection);
        //assertEquals(2, userCollection.size());
        //assertEquals(false, userCollection.isEmpty());

        //Create a second collection with two different users
        Collection<User> userCollection2 = new ArrayList<>();
        User user3 = new User("username1", "1");
        User user4 = new User("username2", "2");
        userCollection2.add(user3);
        userCollection2.add(user4);

        //addAll the second collection to the first collection
        userCollection.addAll(userCollection2);

        //check that the first collection now contains objects from the second
        //collection
        //assertEquals();


    }


}
