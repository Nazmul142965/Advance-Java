package SingleResponsibilityPrinciple.BookManagement;

public class BookRepository {
    public void saveBook(Book book){
        IO.println("Saving book: " + book.title);
    }
}
