public class ElectricityBill {
    static double billAmount = 0;

    public static void generateBill(double units) {
        System.out.println("Generating Bill...");
        billAmount = units * 5; 
        System.out.println("Bill Amount: " + billAmount);
    }

    public static void payBill(double amount) {
        System.out.println("Paying Bill...");
        if (amount >= billAmount) {
            billAmount = 0;
            System.out.println("Bill Paid Successfully!");
        } else {
            System.out.println("Insufficient Payment!");
        }
    }

    public static void checkBill() {
        System.out.println("Pending Bill Amount: " + billAmount);
    }
}
