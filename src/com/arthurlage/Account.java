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

    String updateName (String newName) {
        String oldName = this.name;

        this.name = newName;

        return "Account name was successfully updated from " + oldName + " to " + newName;
    }

    String updateEmail (String newEmail) {
        String oldEmail = this.email;

        this.email = newEmail;

        return "Account email was succesffuly updated from " + oldEmail + " to " + newEmail;
    }
}
