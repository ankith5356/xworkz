class WeaponsR {
    public static void main(String[] weapons) {
        Weapons weapon1 = new Weapons();
        weapon1.displayDetails();

        Weapons weapon2 = new Weapons("AK-47");
        weapon2.displayDetails();

        Weapons weapon3 = new Weapons("M16", "Rifle");
        weapon3.displayDetails();

        Weapons weapon4 = new Weapons("Sniper", "Long-range", 6.5);
        weapon4.displayDetails();

        Weapons weapon5 = new Weapons("Shotgun", "Pump-action", 4.0, false);
        weapon5.displayDetails();

        Weapons weapon6 = new Weapons("Glock", "Handgun", 1.2, true, "Austria");
        weapon6.displayDetails();

        Weapons weapon7 = new Weapons("Rocket Launcher", "Heavy", 20.0, false, "Russia", 3000.0);
        weapon7.displayDetails();
    }
}