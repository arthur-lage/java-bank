package com.arthurlage;

import java.util.UUID;

public class Account {
    String id;
    String name;
    String email;
    double balance;

    String uuid = UUID.randomUUID().toString();

    public Account (String name, String email) {
        this.id = uuid;
        this.name = name;
        this.email = email;
        this.balance = 0;
    }

    String getAccountInfo () {
        return "\nId: " + id + "\nName: " + name + "\nEmail: " + email + "\nBalance: " + balance;
    }

    String deposit (double amount) {
        balance = amount;
        return "You have deposited $" + amount + ". New balance: " + balance;
    }

    String withdraw (double amount ) {
        if(balance >= amount) {
            balance -= amount;
            return "You have withdrew $" + amount + " Successfully. New balance: " + balance;
        } else {
            return "You don't have enough balance to withdraw $" + amount;
        }
    }
}
