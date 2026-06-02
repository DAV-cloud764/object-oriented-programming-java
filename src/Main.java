public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        
        // myAccount.balance = 5000; // ERROR! balance is private.
        
        myAccount.deposit(100.50);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}