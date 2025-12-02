package com.ga.banking.model;

public class Banker extends Person {

    private String username;
    private String password;

    public Banker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void addCustomer(Customer customer){

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
