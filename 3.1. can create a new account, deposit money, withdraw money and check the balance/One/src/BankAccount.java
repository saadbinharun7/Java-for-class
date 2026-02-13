public class BankAccount {
    String name;
    String id;
    double balance;

    public BankAccount(String name, String id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double depAmount){
        if(depAmount > 0){
            balance += depAmount;
            System.out.println("Deposited: " +depAmount);
        }
    }

    public void withdraw (double withAmount){
        if(withAmount > 0 && withAmount <= balance){
            balance -= withAmount;
            System.out.println("Withdrawn: " +withAmount);
        }else{
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "; Id: " + id + "; Balance: " + balance);

    }

}
