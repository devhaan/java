package oops_lab_session_2.library;

public class TextBook extends Book {

    String subject;
    int edition;

    public TextBook() {
        super();
    }

    public TextBook(String subject, int edition, String isbn, String title, String author) {
        super(isbn, title, author, "TextBook");
        this.subject = subject;
        this.edition = edition;
    }
    public TextBook(TextBook textBook) {
        super(textBook.isbn, textBook.title, textBook.author, "TextBook");
        this.subject = textBook.subject;
        this.edition = textBook.edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("*\t"+ author +  "\t\t" + edition + "\t\t"+ title + "\t\t" +  author + "\t\t" +  isbn  + "\t\t" +   isAvailable);
    }
}
