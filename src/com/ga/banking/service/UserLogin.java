package com.ga.banking.service;

import com.ga.banking.model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {

    // https://www.geeksforgeeks.org/java/file-class-in-java/

     Person signIn(String username, String password) {

        File file = new File("src/com/ga/banking/database/Customer.txt");
        if (!file.exists()) {
            try {
                Scanner reader = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }
}