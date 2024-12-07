package oops_lab_session_2.library;

import java.awt.print.Book;

public interface Lendable {

    public boolean lend(User user);
    public void returnBook(User user);
    public boolean isAvailable();
}
