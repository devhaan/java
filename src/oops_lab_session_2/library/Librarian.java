package oops_lab_session_2.library;

public class Librarian extends User {
    String employeeNumber;

    public Librarian() {
        super();
        employeeNumber = null;

    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public Librarian(User user) {
        super(user);
    }


    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian's Dashboard" + "\nName: " + this.getName() + "\nContact: " + this.getContactInfo() + "and Employee no : " + employeeNumber);

    }
    public void addNewBook() {
    }

    public void removeBook() {
    }
}
