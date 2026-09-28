package vecka372026;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public BankAccount() {
        this.balance = 0;
    }

    public void printBalance() {
        System.out.println("Saldo är: " + balance);
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void deposit(int newBalance) {
        balance += newBalance;
    }

    public void withdraw(int newBalance) {

        if (newBalance > balance) {
            System.out.println("Du har inte saldo!");
        } else {
            balance -= newBalance;
        }

    }
}
