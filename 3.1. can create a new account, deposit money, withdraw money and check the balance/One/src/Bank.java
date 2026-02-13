public class Bank {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Saad", "24201212",10000);

        account.withdraw(200);

        account.displayInfo();

        account.deposit(500);

        System.out.println("Current Balance: " +account.getBalance());
    }
}
