package oops_lab_session_2.library;

public class Member extends User {
    int borrowedBooksCount;
    static final int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
        borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
    }

    public Member(User user) {
        super(user);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member's Dashboard" + "\nName: " + this.getName() + "\nContact: " + this.getContactInfo() + "and Books Borrowed: " + borrowedBooksCount);
    }
}
