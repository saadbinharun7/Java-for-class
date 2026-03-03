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
        balance += depAmount;
    }
    public void withdraw(double withAmount) {
            balance -= withAmount;
    }
    public double getBalance(){
        return balance;
    }

    public String getId() {
        return id;
    }

    @Override public String toString(){
        System.out.println("Your Information: ");
        System.out.println("Your name is: " +name);
        System.out.println("Your id no is: " +id);
        System.out.println("Your balance is: " +balance+ "$");
        return " ";
    }
}
