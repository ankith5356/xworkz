class Switch 
{
    // Instance Variables
    String type;
    int voltageRating;
    String material;
    boolean isSmart;
    String application;
    double price;

    // Constructor 1 - No arguments
    Switch() {
        this("Toggle Switch");
        System.out.println("Switch No arguments constructor invoked");
    }

    // Constructor 2
    Switch(String type) {
        this(type, 220);
        System.out.println("Switch 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Switch(String type, int voltageRating) {
        this(type, voltageRating, "Plastic");
        System.out.println("Switch 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Switch(String type, int voltageRating, String material) {
        this(type, voltageRating, material, false);
        System.out.println("Switch 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Switch(String type, int voltageRating, String material, boolean isSmart) {
        this(type, voltageRating, material, isSmart, "Home Appliances");
        System.out.println("Switch 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Switch(String type, int voltageRating, String material, boolean isSmart, String application) {
        this(type, voltageRating, material, isSmart, application, 15.0);
        System.out.println("Switch 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Switch(String type, int voltageRating, String material, boolean isSmart, String application, double price) {
        this.type = type;
        this.voltageRating = voltageRating;
        this.material = material;
        this.isSmart = isSmart;
        this.application = application;
        this.price = price;
        System.out.println("\nSwitch 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Switch Type: " + type);
        System.out.println("Voltage Rating: " + voltageRating + "V");
        System.out.println("Material: " + material);
        System.out.println("Smart Switch: " + (isSmart ? "YES" : "NO"));
        System.out.println("Application: " + application);
        System.out.println("Price: $" + price);
        System.out.println("------------------------------");
    }
}