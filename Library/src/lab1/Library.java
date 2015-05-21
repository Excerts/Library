package lab1;

/**
 * A representation of a library of books.
 *
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu">RaffiKhatchadourian</a>.
 */
public class Library {

    // TODO: Add the missing implementation to this class

    String address;
    Book[] collection = {};

    public Library(String location) {
        address = location;
    }

    public void addBook(Book book) {
        Book[] add = new Book[collection.length + 1];
        for (int i = 0; i < collection.length; i++) {
            add[i] = collection[i];
        }
        add[collection.length] = book;
        collection = add;
    }

    public void borrowBook(String title) {
        boolean inCollection = false;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getTitle().equals(title)) {
                if (collection[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                    inCollection = true;
                } else {
                    collection[i].rented();
                    System.out.println("You successfully borrowed " + title);
                    inCollection = true;
                }
            }
        }
        if (!(inCollection)) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void returnBook(String title) {
        boolean inCollection = false;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getTitle().equals(title)) {
                if (collection[i].isBorrowed()) {
                    System.out.println("You successfully returned " + title);
                    collection[i].returned();
                    inCollection = true;
                }
            }
        }
        if (!(inCollection)) {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAvailableBooks() {
        boolean empty = true;
        for (int i = 0; i < collection.length; i++) {
            if (!(collection[i].isBorrowed())) {
                System.out.println(collection[i].getTitle());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("No book in catalog");
        }
    }

    public void printAddress() {
        System.out.println(address);
    }

    public static void main(String[] args) {
        // Create two libraries

    }
}
