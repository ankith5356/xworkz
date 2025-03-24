public class Library {
    static int books = 10;

    public static void borrowBook() {
        System.out.println("Borrowing Book...");
        if (books > 0) {
            books--;
            System.out.println("Book Borrowed. Books Left: " + books);
        } else {
            System.out.println("No Books Available.");
        }
    }

    public static void returnBook() {
        System.out.println("Returning Book...");
        books++;
        System.out.println("Book Returned. Books Available: " + books);
    }

    public static void checkBooks() {
        System.out.println("Books Available: " + books);
    }
}
