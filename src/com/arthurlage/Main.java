package com.arthurlage;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");

        String userName = scanner.nextLine();

        System.out.print("Email: ");

        String userEmail = scanner.nextLine();

        System.out.println("Creating account...");

        Account account = new Account(userName, userEmail);

        // TODO: Give user the option to choose between seeing account info, depositing or withdrawing.
    }
}
