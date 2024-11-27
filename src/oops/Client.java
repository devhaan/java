package oops;

class Client {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount();

        bk.setBalance(21);
        bk.setOwnerName("devendra");

        bk.deposit(20);
        bk.withdraw(21);
        bk.deposit(123.89);
        bk.getBalance();
        System.out.println(bk.getOwnerName());
    }
}
