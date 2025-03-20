public class LibraryR {

  public static void main(String[] args) {

    Library lib1 = new Library();
    lib1.id = 601;
    lib1.name = "Central Library";
    lib1.location = "Hyderabad";
    lib1.noOfBooks = 50000;
    lib1.noOfMembers = 2000;
    System.out.println("ID is " + lib1.id);

    Library lib2 = new Library();
    lib2.id = 602;
    lib2.name = "City Library";
    lib2.location = "Pune";
    lib2.noOfBooks = 30000;
    lib2.noOfMembers = 1500;
    System.out.println("ID is " + lib2.id);
  }
}
