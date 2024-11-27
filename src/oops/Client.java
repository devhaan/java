package oops;

import java.util.ArrayList;

class Client {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();

        bk.setBalance(21);
        bk.setOwnerName("Devendra Mahor");
        System.out.println(bk.getOwnerName());
        bk.deposit(20);
        bk.withdraw(21);
        bk.deposit(123.89);
        bk.getBalance();
        System.out.println("********************************************************");

        System.out.println("Owner Name : " + bk.getOwnerName());
        System.out.println("********************************************************");


        ArrayList<String> transactions = bk.getTransactionsHistory();
        System.out.println("********************************************************");
        System.out.println(
                "\tTransactions history :"
        );
        transactions.forEach((transaction)-> System.out.println("\t\t"+transaction));
        System.out.println("********************************************************");

    }
}
