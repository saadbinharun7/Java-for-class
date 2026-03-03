package uap;

public class BankAccount {

    private String name;
    private String id;
    private double balance;

    public BankAccount(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double depAmount) {
        if (depAmount > 0) {
            balance += depAmount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withAmount) {
        if (withAmount > 0 && withAmount <= balance) {
            balance -= withAmount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account Name: " + name +
                "\nAccount Number: " + id +
                "\nBalance: " + balance;
    }
}