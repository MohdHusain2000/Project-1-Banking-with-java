package com.ga.banking;

import com.ga.banking.model.Person;
import com.ga.banking.service.UserLogin;

public class Main {
    public static void main(String[] args) {
        UserLogin userLogin = new UserLogin();
        Person person = userLogin.signIn("Ali","Ali3000");
        if (person != null){
            System.out.println("Login");
        } else {
            System.out.println("Login failed");
        }
    }
}
