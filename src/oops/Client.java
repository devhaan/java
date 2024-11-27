package oops;

class Client {
    public static void main(String[] args) {
        BankAccount bk = new BankAccount("Jhon", 90);

        bk.deposit(20);
        bk.withdraw(-110);
        bk.deposit(123.89);
        bk.balanceInAccount();
    }
}
