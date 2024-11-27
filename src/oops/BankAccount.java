package oops;
import java.util.ArrayList;

public class BankAccount {
    private double balance = 0.0;
    private String ownerName;
    public ArrayList<String> Transactions;

    public BankAccount() {
        //nothing
        balance = 0.0;
        ownerName = "";
        Transactions = new ArrayList<>();
    }

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        Transactions = new ArrayList<>();
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            Transactions.add("Deposited " + amount);
        } else {
            System.out.println("Amount to deposit must be positive.");
        }
    }

    void withdraw(double amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                Transactions.add("Withdrew " + amount);
                System.out.println("Withdrawal of " + amount + " successful.");
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Amount to withdraw must be positive.");
        }
    }


    void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    void setOwnerName(String newOwnerName) {
        ownerName = newOwnerName;
    }

    // Method to get the owner's name
    String getOwnerName() {
        return ownerName;
    }

    public ArrayList<String> getTransactionsHistory() {
        return Transactions;
    }
}
