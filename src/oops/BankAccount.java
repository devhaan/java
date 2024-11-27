package oops;

public class BankAccount {
    double balance = 0.0;
    String ownerName;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount to deposit must be positive.");
        }
    }

    void withdraw(double amount) {
        if(amount > 0) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful.");
            } else {
                System.out.println("Insufficient Funds");
            }
        } else {
            System.out.println("Amount to withdraw must be positive.");
        }
    }


    void balanceInAccount() {
        System.out.println("Current Balance: " + balance);
    }

    // Method to get the owner's name
    String getOwnerName() {
        return ownerName;
    }
}
