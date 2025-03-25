class Paper {
    // Instance Variables
    String category;
    int gsmThickness;
    String shade;
    boolean ecoFriendly;
    String dimensions;
    int mass;

    // Constructor 1 - No arguments
    Paper() {
        this("Notebook");
        System.out.println("Paper No-argument constructor invoked");
    }

    // Constructor 2
    Paper(String category) {
        this(category, 80);
        System.out.println("Paper 1-parameter constructor invoked");
    }

    // Constructor 3
    Paper(String category, int gsmThickness) {
        this(category, gsmThickness, "Ivory");
        System.out.println("Paper 2-parameter constructor invoked");
    }

    // Constructor 4
    Paper(String category, int gsmThickness, String shade) {
        this(category, gsmThickness, shade, true);
        System.out.println("Paper 3-parameter constructor invoked");
    }

    // Constructor 5
    Paper(String category, int gsmThickness, String shade, boolean ecoFriendly) {
        this(category, gsmThickness, shade, ecoFriendly, "Letter");
        System.out.println("Paper 4-parameter constructor invoked");
    }

    // Constructor 6
    Paper(String category, int gsmThickness, String shade, boolean ecoFriendly, String dimensions) {
        this(category, gsmThickness, shade, ecoFriendly, dimensions, 10);
        System.out.println("Paper 5-parameter constructor invoked");
    }

    // Constructor 7 - Main constructor
    Paper(String category, int gsmThickness, String shade, boolean ecoFriendly, String dimensions, int mass) {
        this.category = category;
        this.gsmThickness = gsmThickness;
        this.shade = shade;
        this.ecoFriendly = ecoFriendly;
        this.dimensions = dimensions;
        this.mass = mass;
        System.out.println("\nPaper 6-parameter constructor invoked");
    }

    // Method to display details
    void showDetails() {
        System.out.println("Paper Category: " + category);
        System.out.println("GSM Thickness: " + gsmThickness);
        System.out.println("Shade: " + shade);
        System.out.println("Eco-Friendly: " + (ecoFriendly ? "YES" : "NO"));
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Mass: " + mass + " grams");
        System.out.println("------------------------------");
    }
}
