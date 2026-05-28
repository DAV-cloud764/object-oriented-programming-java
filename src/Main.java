class BankAccount {
    // Private: Cannot be accessed directly from outside this class
    private double balance;

    // Setter: Controls HOW data is modified (e.g., no negative deposits)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Getter: Controls HOW data is viewed
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        
        // myAccount.balance = 5000; // ERROR! balance is private.
        
        myAccount.deposit(100.50);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}