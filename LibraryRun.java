public class LibraryRun {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Library.borrowBook();

        Library.returnBook();

        Library.borrowBook();

        Library.checkBooks();

        System.out.println("Main Ended");
    }
}
