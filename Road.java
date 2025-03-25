class Road {
    // Instance Variables
    String routeName;
    String category;
    double distance;
    boolean highwayStatus;
    String pavementType;
    int laneCount;

    // Constructor 1 - No arguments
    Road() {
        this("Sunset Boulevard");
        System.out.println("Road No-argument constructor invoked");
    }

    // Constructor 2
    Road(String routeName) {
        this(routeName, "Residential Street");
        System.out.println("Road 1-parameter constructor invoked");
    }

    // Constructor 3
    Road(String routeName, String category) {
        this(routeName, category, 10.5);
        System.out.println("Road 2-parameter constructor invoked");
    }

    // Constructor 4
    Road(String routeName, String category, double distance) {
        this(routeName, category, distance, false);
        System.out.println("Road 3-parameter constructor invoked");
    }

    // Constructor 5
    Road(String routeName, String category, double distance, boolean highwayStatus) {
        this(routeName, category, distance, highwayStatus, "Concrete");
        System.out.println("Road 4-parameter constructor invoked");
    }

    // Constructor 6
    Road(String routeName, String category, double distance, boolean highwayStatus, String pavementType) {
        this(routeName, category, distance, highwayStatus, pavementType, 4);
        System.out.println("Road 5-parameter constructor invoked");
    }

    // Constructor 7 - Main constructor
    Road(String routeName, String category, double distance, boolean highwayStatus, String pavementType, int laneCount) {
        this.routeName = routeName;
        this.category = category;
        this.distance = distance;
        this.highwayStatus = highwayStatus;
        this.pavementType = pavementType;
        this.laneCount = laneCount;
        System.out.println("\nRoad 6-parameter constructor invoked");
    }

    // Method to display details
    void showDetails() {
        System.out.println("Road Name: " + routeName);
        System.out.println("Category: " + category);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Highway: " + (highwayStatus ? "YES" : "NO"));
        System.out.println("Pavement Type: " + pavementType);
        System.out.println("Lanes: " + laneCount);
        System.out.println("------------------------------");
    }
}
