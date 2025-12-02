package com.ga.banking.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{

    private String username;
    private String password;
    private List<Account> accounts;

    public Customer(String username, String password){
        this.username = username;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    @Override
    String getUsername() {
        return username;
    }

    @Override
    String getPassword() {
        return password;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
