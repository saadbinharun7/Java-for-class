package uap.app;

import uap.BankAccount;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[10];
        int count = 0;

        int choice;

        do {
            System.out.println("\n===== Banking System Menu =====");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Specific Account Details");
            System.out.println("6. View All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < accounts.length) {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Account Number: ");
                        String id = sc.nextLine();

                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();

                        accounts[count] = new BankAccount(name, id, balance);
                        count++;

                        System.out.println("Account Created Successfully!");
                    } else {
                        System.out.println("Account limit reached!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depId = sc.nextLine();

                    System.out.print("Enter Deposit Amount: ");
                    double depAmount = sc.nextDouble();

                    boolean foundDep = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getId() == depId) {
                            accounts[i].deposit(depAmount);
                            foundDep = true;
                            break;
                        }
                    }

                    if (!foundDep) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String withId = sc.nextLine();

                    System.out.print("Enter Withdraw Amount: ");
                    double withAmount = sc.nextDouble();

                    boolean foundWith = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getId() == withId) {
                            accounts[i].withdraw(withAmount);
                            foundWith = true;
                            break;
                        }
                    }

                    if (!foundWith) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String balId = sc.nextLine();

                    boolean foundBal = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getId() == balId) {
                            System.out.println("Balance: " + accounts[i].getBalance());
                            foundBal = true;
                            break;
                        }
                    }

                    if (!foundBal) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    String viewId = sc.nextLine();

                    boolean foundView = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getId() == viewId) {
                            System.out.println(accounts[i]);
                            foundView = true;
                            break;
                        }
                    }

                    if (!foundView) {
                        System.out.println("Account not found!");
                    }
                    break;

                case 6:
                    if (count == 0) {
                        System.out.println("No accounts available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\n--- Account " + (i + 1) + " ---");
                            System.out.println(accounts[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}