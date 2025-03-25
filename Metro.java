class Metro {
    // Instance Variables
    String location;
    int totalRoutes;
    String themeColor;
    boolean inService;
    String management;
    int maxPassengers;

    // Constructor 1 - No arguments
    Metro() {
        this("London");
        System.out.println("Metro No-argument constructor invoked");
    }

    // Constructor 2
    Metro(String location) {
        this(location, 8);
        System.out.println("Metro 1-parameter constructor invoked");
    }

    // Constructor 3
    Metro(String location, int totalRoutes) {
        this(location, totalRoutes, "Red");
        System.out.println("Metro 2-parameter constructor invoked");
    }

    // Constructor 4
    Metro(String location, int totalRoutes, String themeColor) {
        this(location, totalRoutes, themeColor, true);
        System.out.println("Metro 3-parameter constructor invoked");
    }

    // Constructor 5
    Metro(String location, int totalRoutes, String themeColor, boolean inService) {
        this(location, totalRoutes, themeColor, inService, "Private Operator");
        System.out.println("Metro 4-parameter constructor invoked");
    }

    // Constructor 6
    Metro(String location, int totalRoutes, String themeColor, boolean inService, String management) {
        this(location, totalRoutes, themeColor, inService, management, 1500);
        System.out.println("Metro 5-parameter constructor invoked");
    }

    // Constructor 7 - Main constructor
    Metro(String location, int totalRoutes, String themeColor, boolean inService, String management, int maxPassengers) {
        this.location = location;
        this.totalRoutes = totalRoutes;
        this.themeColor = themeColor;
        this.inService = inService;
        this.management = management;
        this.maxPassengers = maxPassengers;
        System.out.println("\nMetro 6-parameter constructor invoked");
    }

    // Method to display details
    void showDetails() {
        System.out.println("Metro Location: " + location);
        System.out.println("Total Routes: " + totalRoutes);
        System.out.println("Theme Color: " + themeColor);
        System.out.println("In Service: " + (inService ? "YES" : "NO"));
        System.out.println("Management: " + management);
        System.out.println("Max Passengers: " + maxPassengers + " per train");
        System.out.println("------------------------------");
    }
}
