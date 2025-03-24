public class ElectriCityRun {
    public static void main(String[] args) {
        System.out.println("Main Started");

        ElectriCity.getUnits();

        ElectriCity.calculateBill(100);

        ElectriCity.getUnits();

        ElectriCity.calculateBill(50);

        ElectriCity.getUnits();

        System.out.println("Main Ended");
    }
}
