package uap.app;

import uap.BankAccount;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("\033[32m" + "============= Welcome to Uap Bank =============" + "\033[0m");
        BankAccount[] accounts = new BankAccount[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {

            System.out.println("\033[33m" + "==================== Menu =====================" + "\033[0m");
            System.out.println("\033[93m" + "Enter ‘1’ to create a new account.");
            System.out.println("Enter ‘2’ to deposit money.");
            System.out.println("Enter ‘3’ to withdraw money.");
            System.out.println("Enter ‘4’ to display the balance of your account.");
            System.out.println("Enter ‘5’ to display the details of your account.");
            System.out.println("Enter ‘6’ to display the details of all accounts.");
            System.out.println("Enter ‘0’ to exit the system." + "\033[0m");
            int menu = sc.nextInt();
            if (menu == 1) {
                boolean accountCreated = false;
                if (count < 10) {
                    System.out.println("\033[35m" + "For Create a new account: ");
                    System.out.print("\033[95m" + "Your name is: ");
                    String name = sc.next();
                    System.out.print("Your Id is: ");
                    String id = sc.next();
                    System.out.print("Your Initial Balance is ($): " + "\033[0m");
                    double balance = sc.nextDouble();

                    accounts[count] = new BankAccount(name, id, balance);
                    count++;

                    accountCreated = true;
                }
                if (accountCreated = true) {
                    System.out.println("\033[94m" + "Your account successfully created" + "\033[0m");
                } else {
                    System.out.println("\033[94m" + "Maximum amount of account already exist in the bank" + "\033[0m");
                }
            }
            if (menu == 2) {
                System.out.println("\033[35m" + "For deposit money: " + "\033[0m");
                System.out.print("\033[95m" + "Enter your bank ID: ");
                String idMatch = sc.next();
                boolean idFound = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].getId().equals(idMatch)) {
                        System.out.print("Enter amount of money you want to deposit: " + "\033[0m");
                        double depAmount = sc.nextDouble();
                        accounts[i].deposit(depAmount);
                        idFound = true;
                        break;
                    }
                }
                if (idFound == true) {
                    System.out.println("\033[94m" + "You Successfully deposited money");
                    System.out.println("Thanks" + "\033[0m");
                } else {
                    System.out.println("\033[94m" + "Account ID mismatch" + "\033[0m");
                }
            }
            if (menu == 3) {
                System.out.println("\033[35m" + "For withdraw money: ");
                System.out.print("Enter your bank ID: ");
                String idMatch = sc.next();
                boolean idFound = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].getId().equals(idMatch)) {
                        System.out.println("Your Current Balance is: " +accounts[i].getBalance()+ "$");
                        System.out.print("Enter amount of money you want to withdraw: " + "\033[0m");
                        double withAmount = sc.nextDouble();
                        if(accounts[i].getBalance() >= withAmount && accounts[i].getBalance() > 0) {
                            accounts[i].withdraw(withAmount);
                            System.out.println("\033[94m" + "You Successfully withdrawed money" + "\033[0m");
                        }else{
                            System.out.println("\033[94m" + "Insufficient Balance" + "\033[0m");
                        }
                        idFound = true;
                        break;
                    }
                }
                if (idFound == true) {
                    System.out.println("\033[94m" + "Thanks" + "\033[0m");
                } else {
                    System.out.println("\033[94m" + "Account ID mismatch" + "\033[0m");
                }
            }
            if (menu == 4) {
                System.out.println("\033[35m" + "To display your balance: ");
                System.out.print("Enter your bank ID: " + "\033[0m");
                String idMatch = sc.next();
                boolean idFound = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].getId().equals(idMatch)) {
                        System.out.println("\033[94m" + "Your Current Balance is: " + accounts[i].getBalance()+ "$" + "\033[0m");
                        idFound = true;
                        break;
                    }
                }
                if (idFound == true) {
                    System.out.println("\033[94m" + "Thanks" + "\033[0m");
                } else {
                    System.out.println("\033[94m" + "Account ID mismatch" + "\033[0m");
                }
            }
            if (menu == 5) {
                System.out.println("\033[35m" + "To Display Your Account Details: ");
                System.out.print("Enter your bank id: " + "\033[0m");
                String idMatch = sc.next();
                boolean idFound = false;
                for (int i = 0; i < count; i++) {
                    if (accounts[i].getId().equals(idMatch)) {
                        accounts[i].toString();
                        idFound = true;
                        break;
                    }
                }
                if (idFound == true) {
                    System.out.println("\033[94m" + "Thanks" + "\033[0m");
                } else {
                    System.out.println("\033[94m" + "Account ID mismatch" + "\033[0m");
                }
            }
            if (menu == 6) {
                System.out.println("\033[35m" + "Accessing all details from every account..." + "\033[0m");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                for (int i = 0; i < count; i++) {
                    System.out.println("\033[96m" + "Account " + (i+1) + " Information: " + "\033[0m");
                    accounts[i].toString();
                }
            }
            if (menu == 0) {
                System.out.println("\033[94m" + "Thanks For Using UAP Bank" + "\033[0m");
                break;
            }
        }

    }
}
