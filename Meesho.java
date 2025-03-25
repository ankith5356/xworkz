// Constructor Chaining

public class Meesho {
    Meesho() {

        // this.("Baba","Singh")

        System.out.println("\n Description :");
    }

    Meesho(int id, String item, int quantity) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
    }

    int id;
    String item;
    int quantity;

    public void displayInfo() {
        System.out.println("Item id is " + this.id);
        System.out.println("item is " + this.item);
        System.out.println("Item Quantity is: " + this.quantity);

        // // Instance Variable
        // public void displayInfo() {
        // System.out.println("Item id is " + id);
        // System.out.println("item is " + item);
        // System.out.println("Item Quantity is: " + quantity);
        // }
    }
}
