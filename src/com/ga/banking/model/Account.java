package com.ga.banking.model;

public class Account {
    private String accountNum;
    private String accountType;


    public Account(String accountNum, String accountType){
        this.accountNum = accountNum;
        this.accountType = accountType;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}