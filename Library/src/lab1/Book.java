package lab1;

/**
 * A representation of a book.
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu">Raffi Khatchadourian</a>.
 */
public class Book {

   
    
     
    private String title;
 
    private boolean borrowed;

    
     
    
     
    public Book(String bookTitle) {
    bookTitle = "Of Mice and Men";
    title = bookTitle;
    }
   

    public void rented() {
    int rented = 1;
    borrowed = true;
    }
   

    public void returned() {
    int returned = 2;
    borrowed = false;
    }
   

    public boolean isBorrowed() {
    return borrowed;
    }
   

    public String getTitle() {
     return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
} 
