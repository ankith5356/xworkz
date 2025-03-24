public class CyberCafe {
    static int systems = 10;

    public static void useSystem(){
        System.out.println("Using System...");
        if (systems > 0) {
            systems--;
            System.out.println("System in Use. Systems Left: " + systems);
        } else {
            System.out.println("No Systems Available.");
        }
    }

    public static void leaveSystem(){
        System.out.println("Leaving System...");
        systems++;
        System.out.println("System Left. Systems Available: " + systems);
    }

    public static void checkSystems(){
        System.out.println("Systems Available: " + systems);
    }
}
