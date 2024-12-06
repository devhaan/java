package oops_lab_session_1;

import java.util.ArrayList;

class Client {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount("Devendra Mahor", 21);


        System.out.println(bk.getOwnerName());
        bk.deposit(20);
        bk.withdraw(21);
        bk.deposit(123.89);
        bk.getBalance();
        System.out.println("********************************************************");
        System.out.println("\033[0;1m" + "Owner Name : " + bk.getOwnerName());
        System.out.println("********************************************************");


        ArrayList<String> transactions = bk.getTransactionsHistory();
        System.out.println("********************************************************");
        System.out.println(
                "\033[0;1m" +  "\tTransactions history :"
        );
        transactions.forEach((transaction)-> System.out.println("\t\t"+transaction));
        System.out.println("********************************************************");

    }
}
