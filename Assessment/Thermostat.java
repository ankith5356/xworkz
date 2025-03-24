public class Thermostat {
    public static void main(String[] args) {
        String device="Thermostat";
        String range="50 ~ 110";
        String resolution="9.9-99.9 0.1";
        double accuracy= 0.1;
        System.out.println("Thermostat range varies from "+range);
        System.out.println("The resolution of the "+device+"is"+resolution);
        System.out.println("Accuracy is "+accuracy);
    }
}
