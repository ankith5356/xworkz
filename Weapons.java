class Weapons 
{
    // Instance Variables
    String name;
    String type;
    double weight;
    boolean isAutomatic;
    String origin;
    double range;

    // Constructor 1 - No arguments
    Weapons() {
        this("Pistol");
        System.out.println("Weapons No arguments constructor invoked");
    }

    // Constructor 2
    Weapons(String name) {
        this(name, "Handgun");
        System.out.println("Weapons 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Weapons(String name, String type) {
        this(name, type, 2.5);
        System.out.println("Weapons 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Weapons(String name, String type, double weight) {
        this(name, type, weight, false);
        System.out.println("Weapons 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Weapons(String name, String type, double weight, boolean isAutomatic) {
        this(name, type, weight, isAutomatic, "USA");
        System.out.println("Weapons 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Weapons(String name, String type, double weight, boolean isAutomatic, String origin) {
        this(name, type, weight, isAutomatic, origin, 500.0);
        System.out.println("Weapons 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Weapons(String name, String type, double weight, boolean isAutomatic, String origin, double range) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.isAutomatic = isAutomatic;
        this.origin = origin;
        this.range = range;
        System.out.println("\nWeapons 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Weapon Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Automatic: " + (isAutomatic ? "YES" : "NO"));
        System.out.println("Origin: " + origin);
        System.out.println("Range: " + range + " meters");
        System.out.println("------------------------------");
    }
}