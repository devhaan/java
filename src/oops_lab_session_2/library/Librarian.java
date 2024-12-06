package oops_lab_session_2.library;

public class Librarian extends User {
    String employeeNumber;


    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void displayDashboard() {
        System.out.println(" Librarian Dashboard and the employeeNumber ");
    }
}
