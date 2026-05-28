public class BankAccount {
    // private variable
    private double balance;

    // set-method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    // get method
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        BankAccount Acc = new BankAccount();
        Acc.deposit(3000);

        System.out.println("Balance: " + Acc.getBalance());
    }
}
