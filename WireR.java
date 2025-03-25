class WireR {
    public static void main(String[] wire) {
        Wire wire1 = new Wire();
        wire1.displayDetails();

        Wire wire2 = new Wire("Aluminum");
        wire2.displayDetails();

        Wire wire3 = new Wire("Steel", 20);
        wire3.displayDetails();

        Wire wire4 = new Wire("Fiber Optic", 50, "Blue");
        wire4.displayDetails();

        Wire wire5 = new Wire("Gold", 5, "Yellow", false);
        wire5.displayDetails();

        Wire wire6 = new Wire("Silver", 15, "Gray", true, "Coaxial");
        wire6.displayDetails();

        Wire wire7 = new Wire("Nickel", 30, "Black", false, "Thermocouple", 3);
        wire7.displayDetails();
    }
}