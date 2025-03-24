public class PublicChargeRun {
    public static void main(String[] args) {
        System.out.println("Main Started");

        PublicCharge.getUnits();

        PublicCharge.calculateBill(100);

        PublicCharge.getUnits();

        PublicCharge.calculateBill(50);

        PublicCharge.getUnits();

        System.out.println("Main Ended");
    }
}
