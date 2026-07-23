package SingleResponsibilityPrinciple.BookManagement;

public class BookPrinter {
    public void printBook(Book book){
        IO.println("Printing book: " + book.title);
        IO.println("Author: " + book.author);
    }
}
