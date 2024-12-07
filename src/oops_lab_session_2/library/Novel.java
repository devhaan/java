package oops_lab_session_2.library;

public class Novel extends Book{
    String genre;

    public Novel() {
        super();
    }

    public Novel(String genre, String isbn, String title, String author) {
        super(isbn, title, author, "NovelBook");
        this.genre = genre;
    }
    public Novel(Novel novelBook) {
        super(novelBook.isbn, novelBook.title, novelBook.author, "NovelBook");
        this.genre = novelBook.genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Genre: " + genre + "\n Book title: " + this.title + "\n Book author: " + this.author + "\n Book isbn: " + this.isbn);
    }
}
