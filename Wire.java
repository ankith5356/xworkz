public class Wire {

    String material;
    int length;
    String color;
    boolean isInsulated;
    String type;
    int thickness;

    // Constructor 1
    Wire() {
        this("Copper");
        System.out.println("Wire NO args constructor invoked");
    }

    // Constructor 2
    Wire(String material) {
        this(material, 10);
        System.out.println("Wire 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Wire(String material, int length) {
        this(material, length, "Red");
        System.out.println("Wire 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Wire(String material, int length, String color) {
        this(material, length, color, true);
        System.out.println("Wire 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Wire(String material, int length, String color, boolean isInsulated) {
        this(material, length, color, isInsulated, "Electrical");
        System.out.println("Wire 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Wire(String material, int length, String color, boolean isInsulated, String type) {
        this(material, length, color, isInsulated, type, 2);
        System.out.println("Wire 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Wire(String material, int length, String color, boolean isInsulated, String type, int thickness) {
        this.material = material;
        this.length = length;
        this.color = color;
        this.isInsulated = isInsulated;
        this.type = type;
        this.thickness = thickness;
        System.out.println("\nWire 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Wire Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Color: " + color);
        System.out.println("Insulated: " + (isInsulated ? "YES" : "NO"));
        System.out.println("Type: " + type);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("------------------------------");
    }
}
