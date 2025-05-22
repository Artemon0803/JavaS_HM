package Voting_System;

import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Users {
    private SortedMap<String, String> users = new TreeMap<>();

    public boolean addUser(String username, String password) {
        Pattern usernamePattern = Pattern.compile("[A-Za-z]\\w*(_|-)[A-Za-z]\\w*");
        Pattern passwordPattern = Pattern.compile("[A-Za-z0-9]{5,30}");

        boolean isCreated = false;

        if (!usernamePattern.matcher(username).matches()) {
            System.out.println("Invalid username format!");
        } else if (!passwordPattern.matcher(password).matches()) {
            System.out.println("Invalid password format!");
        } else {
            if(isUserRegistered(username)) {
                System.out.println("Username already exists!\nPlease try another one.");
            } else {
                users.put(username, password);
                System.out.println("User successfully added.");
                isCreated = true;
            }
        }
        return isCreated;
    }

    public boolean isUserRegistered(String username){
        return users.containsKey(username);
    }

    public boolean logIn(String username, String password){
        return users.containsKey(username) && Objects.equals(users.get(username), password);
    }

    public void testData() {
        String[][] testUsers = {{"First-user", "123456"}, {"tester_test", "Testpass123"}, {"Vlad_Gray", "vlad6556"}};
        for(String[] usr : testUsers) {
            users.put(usr[0], usr[1]);
        }
    }
}
