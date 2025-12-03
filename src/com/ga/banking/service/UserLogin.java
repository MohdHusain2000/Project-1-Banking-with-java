package com.ga.banking.service;

import com.ga.banking.model.Customer;
import com.ga.banking.model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// https://www.geeksforgeeks.org/java/file-class-in-java/
// https://www.javaguides.net/2024/04/building-login-and-registration-system-with-java.html

public class UserLogin {

     public Person signIn(String username, String password) {

         File file = new File("src/com/ga/banking/fileHandling/Customer-Mohamed-01.txt");
         try {
                Scanner scanner = new Scanner(file);

             if (scanner.hasNextLine()) {
                 String fileUsername = scanner.nextLine().replace("Username:", "").trim();
                 String filePassword = scanner.nextLine().replace("Password:", "").trim();

                 if (fileUsername.equals(username) && filePassword.equals(password)) {
                     return new Customer(fileUsername, filePassword);

                 }
             }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

         return null;
     }
}