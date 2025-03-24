public class ElectricScooter {
    public static void main(String[] args) {
        int scooterId = 1101;
        String scooterBrand = "Segway";
        String scooterModel = "Ninebot MAX";
        int maxSpeed = 30; 
        int batteryRange = 65; 
        double scooterPrice = 649.99;

        System.out.println("Scooter ID: " + scooterId);
        System.out.println("Brand: " + scooterBrand);
        System.out.println("Model: " + scooterModel);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Battery Range: " + batteryRange + " km");
        System.out.println("Price: $" + scooterPrice);
    }
}
