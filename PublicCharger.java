public class PublicCharger {
    static int chargerCount = 0;
    public static void chargerCount() {
        System.out.println("Charger Available");
        chargerCount++;
        System.out.println("Charger Count: " + chargerCount);
    }

    public static void chargerUsed() {
        System.out.println("Charger in Use...");
        if (chargerCount > 0) {
            chargerCount--;
            System.out.println("Charger in Use. Chargers Left: " + chargerCount);
        } else {
            System.out.println("No Chargers Available.");
        }
    }

    public static void chargerLeft() {
        System.out.println("Charger Left...");
        chargerCount++;
        System.out.println("Charger Left. Chargers Available: " + chargerCount);
    }
}
