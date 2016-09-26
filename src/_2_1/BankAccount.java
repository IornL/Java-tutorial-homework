package _2_1;

/**
 * Created by 28013 on 2016/9/26.
 */
public class BankAccount {
    static class Account {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void deposit(double amoumt) {
            balance += amoumt;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        Account(double amount) {
            balance = amount;
        }
    }

    public static void main(String[] args) {
        Account a = new Account(0);
        System.out.printf("Account balance: %.2f\n", a.getBalance());
        a.deposit(12.34);
        System.out.printf("Account balance: %.2f\n", a.getBalance());
        a.withdraw(2.34);
        System.out.printf("Account balance: %.2f\n", a.getBalance());

    }
}
