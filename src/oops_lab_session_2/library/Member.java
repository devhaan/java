package oops_lab_session_2.library;

public class Member extends User {
    int borrowedBooksCount;
    static final int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT ? true : false;
    }

    @Override
    public void displayDashboard() {
        System.out.println(" Member 's Dashboard and Books Borrowed: " + borrowedBooksCount);
    }
}
