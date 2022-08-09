package com.arthurlage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");

        String userName = scanner.nextLine();

        System.out.print("Email: ");

        String userEmail = scanner.nextLine();

        System.out.println("Creating account...");

        Account account = new Account(userName, userEmail);

        boolean exit = false;

        do {
            System.out.println("""
                    
                    Welcome!
                    1- See account info
                    2- Deposit
                    3- Withdraw
                    4- Update name
                    5- Update email
                    6- Exit
                    """);

            int option = scanner.nextInt();

            scanner.nextLine();

            if(option == 1 ) {
                System.out.println(account.getAccountInfo());
            }

            if(option == 2) {
                System.out.println("How much would you like to deposit: ");
                double amount = scanner.nextDouble();

                String result = account.deposit(amount);
                System.out.println(result);
            }

            if(option == 3) {
                System.out.println("How much would you like to withdraw: ");
                double amount = scanner.nextDouble();

                String result = account.withdraw(amount);
                System.out.println(result);
            }

            if(option == 4) {
                System.out.println("Type a new name for your Java Bank account: ");

                String newName = scanner.nextLine();

                String result = account.updateName(newName);
                System.out.println(result);
            }

            if(option == 5) {
                System.out.println("Type a new email for your Java Bank account: ");

                String newEmail = scanner.nextLine();

                String result = account.updateEmail(newEmail);
                System.out.println(result);
            }


            if(option == 6) {
                exit = true;
                System.out.println("Thank you for using Java Bank. Goodbye!");
            }
        } while (!exit);
    }
}
