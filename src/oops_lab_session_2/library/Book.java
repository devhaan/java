package oops_lab_session_2.library;

public abstract class Book implements Lendable{
    String isbn, title, author,type;
    boolean isAvailable;
    enum BookType {
        TextBook,
        NovelBook
    }
    public Book() {
    isAvailable = true;
    }
    public Book(String isbn, String title, String author, String type) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        isAvailable = true;
        this.type = type;
    }
     public Book(Book book) {
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = book.isAvailable;
     }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()) {
            user.borrowBook();
            if( user instanceof Member) {
                Member member = (Member) user;
                member.bookLendedMap.put(this.isbn, this.title);
            }
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        if( user instanceof Member) {
            Member member = (Member) user;
            member.bookLendedMap.remove(this.isbn);
        }
        user.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
