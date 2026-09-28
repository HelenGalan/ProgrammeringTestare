package vecka372026;

public class Bank {
    static void main() {

        BankAccount account = new BankAccount(100);

        account.printBalance();
        account.setBalance(1000);
        System.out.println(account.getBalance());
        account.printBalance();
        account.deposit(500);
        account.printBalance();
        account.withdraw(2000);
        account.printBalance();
    }
}
