class Soil 
{
    // Instance Variables
    String type;
    String color;
    double pHLevel;
    boolean isFertile;
    String texture;
    double moistureContent;

    // Constructor 1 - No arguments
    Soil() {
        this("Loamy");
        System.out.println("Soil No arguments constructor invoked");
    }

    // Constructor 2
    Soil(String type) {
        this(type, "Brown");
        System.out.println("Soil 1 Parameterized constructor invoked");
    }

    // Constructor 3
    Soil(String type, String color) {
        this(type, color, 6.5);
        System.out.println("Soil 2 Parameterized constructor invoked");
    }

    // Constructor 4
    Soil(String type, String color, double pHLevel) {
        this(type, color, pHLevel, true);
        System.out.println("Soil 3 Parameterized constructor invoked");
    }

    // Constructor 5
    Soil(String type, String color, double pHLevel, boolean isFertile) {
        this(type, color, pHLevel, isFertile, "Medium");
        System.out.println("Soil 4 Parameterized constructor invoked");
    }

    // Constructor 6
    Soil(String type, String color, double pHLevel, boolean isFertile, String texture) {
        this(type, color, pHLevel, isFertile, texture, 20.0);
        System.out.println("Soil 5 Parameterized constructor invoked");
    }

    // Constructor 7 - Main constructor
    Soil(String type, String color, double pHLevel, boolean isFertile, String texture, double moistureContent) {
        this.type = type;
        this.color = color;
        this.pHLevel = pHLevel;
        this.isFertile = isFertile;
        this.texture = texture;
        this.moistureContent = moistureContent;
        System.out.println("\nSoil 6 Parameterized constructor invoked");
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Soil Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Fertile: " + (isFertile ? "YES" : "NO"));
        System.out.println("Texture: " + texture);
        System.out.println("Moisture Content: " + moistureContent + "%");
        System.out.println("------------------------------");
    }
}