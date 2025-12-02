package com.ga.banking.model;

import javax.crypto.Cipher;
import java.util.ArrayList;
import java.util.List;

public class Banker extends Person {

    private String username;
    private String password;
    private List<Customer> customers;

    public Banker(String username, String password) {
        this.username = username;
        this.password = password;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
