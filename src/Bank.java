public class Bank{

    private String owner;
    private double balance;

    public Bank(String owner, double balance){
        this.owner = owner;

        if (balance > 0){
            this.balance = balance;
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount < balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] arg){
        Bank acc = new Bank("David", 5000);
        acc.deposit(6000);
        acc.withdraw(7000);

        System.out.println(acc.getBalance());
    }
}