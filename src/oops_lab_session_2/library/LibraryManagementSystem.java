package oops_lab_session_2.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory;
    List<User> registeredUsers;

    LibraryManagementSystem(){
        bookInventory = new ArrayList<Book>();
        registeredUsers = new ArrayList<User>();
    }
    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public List<Book> getBookInventory() {
        return bookInventory;
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void displayBookDetails() {
        for ( Book book : bookInventory) {
            book.displayBookDetails();
        }
    }
    public void displayUserDetails() {
        for ( User user : registeredUsers) {
            user.displayDashboard();
        }
    }

    public Book searchBook(String criteria) {
        for ( Book book : bookInventory) {
            if(book.title.equalsIgnoreCase(criteria) || book.author.equalsIgnoreCase(criteria)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBook(String criteria, String type) {

        for ( Book book : bookInventory) {
            if((book.title.equalsIgnoreCase(criteria) || book.author.equalsIgnoreCase(criteria)) && book.type.equals(type)) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        User user1 = new Member("Devendra", "+91-9111283017");
        User user2 = new Member("Mahor", "+91-9111283018");
        User user3 = new Member("Heer", "+91-9111283013");
        User user4 = new Member("Mahor", "+91-9111283019");
        User user5 = new Member("Heer", "+91-9111283016");
        User user6 = new Librarian("Mahor", "+91-9111283011", "qweqrty6677");

        Book  book1 = new TextBook("Science", 12, "qwerty6546455", "Secret Science", "Ved Roham");
        Book  book2 = new TextBook("Social", 130, "qwerty68665", "Secret Social", "Heer Roham");
        Book  book3 = new TextBook("Science", 124, "qwerty65455", "Secret Science", "Ved Roham");
        Book  book4 = new Novel("story",  "qwerty68585", "Secret Social", "Heer Roham");
        Book  book5 = new Novel("fiction",  "qwerty65445", "Secret Science", "Ved Roham");
        Book  book6 = new Novel("horror", "qwerty65885", "Secret Social", "Heer Roham");


        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);
        lms.addBook(book4);
        lms.addBook(book5);
        lms.addBook(book6);

        lms.registeredUsers.add(user1);
        lms.registeredUsers.add(user2);
        lms.registeredUsers.add(user3);
        lms.registeredUsers.add(user4);
        lms.registeredUsers.add(user5);
        lms.registeredUsers.add(user6);


        lms.displayBookDetails();
        lms.displayUserDetails();

        if(book1.lend(user1)){
            System.out.println("Book lent successfully");
        }
        if(book2.lend(user1)){
            System.out.println("Book lent successfully");
        }
        if(book3.lend(user1)){
            System.out.println("Book lent successfully");
        }
        if(book4.lend(user1)){
            System.out.println("Book lent successfully");
        }
        if(book5.lend(user1)){
            System.out.println("Book lent successfully");
        }
        if(book6.lend(user1)){
            System.out.println("Book lent successfully");
        } else {
            System.out.println("Book not available");
        }
         book5.returnBook(user1);
        if(book6.lend(user1)){
            System.out.println("Book lent successfully");
        }

        user1.displayBorrowedBooksCount();




    }
}
