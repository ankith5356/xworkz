class House {
    // Instance Variables
    String category;
    int totalRooms;
    String exteriorColor;
    boolean hasParking;
    String area;
    double cost;

    // Constructor 1 - No arguments
    House() {
        this("Villa");
        System.out.println("House No-argument constructor invoked");
    }

    // Constructor 2
    House(String category) {
        this(category, 4);
        System.out.println("House 1-parameter constructor invoked");
    }

    // Constructor 3
    House(String category, int totalRooms) {
        this(category, totalRooms, "Beige");
        System.out.println("House 2-parameter constructor invoked");
    }

    // Constructor 4
    House(String category, int totalRooms, String exteriorColor) {
        this(category, totalRooms, exteriorColor, false);
        System.out.println("House 3-parameter constructor invoked");
    }

    // Constructor 5
    House(String category, int totalRooms, String exteriorColor, boolean hasParking) {
        this(category, totalRooms, exteriorColor, hasParking, "Suburban");
        System.out.println("House 4-parameter constructor invoked");
    }

    // Constructor 6
    House(String category, int totalRooms, String exteriorColor, boolean hasParking, String area) {
        this(category, totalRooms, exteriorColor, hasParking, area, 500000);
        System.out.println("House 5-parameter constructor invoked");
    }

    // Constructor 7 - Main constructor
    House(String category, int totalRooms, String exteriorColor, boolean hasParking, String area, double cost) {
        this.category = category;
        this.totalRooms = totalRooms;
        this.exteriorColor = exteriorColor;
        this.hasParking = hasParking;
        this.area = area;
        this.cost = cost;
        System.out.println("\nHouse 6-parameter constructor invoked");
    }

    // Method to display details
    void showDetails() {
        System.out.println("House Category: " + category);
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Exterior Color: " + exteriorColor);
        System.out.println("Has Parking: " + (hasParking ? "YES" : "NO"));
        System.out.println("Area: " + area);
        System.out.println("Cost: $" + cost);
        System.out.println("------------------------------");
    }
}
