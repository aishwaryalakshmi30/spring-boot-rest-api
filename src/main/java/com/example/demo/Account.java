package com.example.demo;

public class Account {

    private String holderName;
    private double balance;

    public Account() {
    }

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}