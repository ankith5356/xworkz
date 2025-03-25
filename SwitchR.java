class SwitchR {
    public static void main(String[] button) {
        Switch switch1 = new Switch();
        switch1.displayDetails();

        Switch switch2 = new Switch("Push Button Switch");
        switch2.displayDetails();

        Switch switch3 = new Switch("Rotary Switch", 110);
        switch3.displayDetails();

        Switch switch4 = new Switch("Dimmer Switch", 240, "Metal");
        switch4.displayDetails();

        Switch switch5 = new Switch("Rocker Switch", 230, "Plastic", false);
        switch5.displayDetails();

        Switch switch6 = new Switch("Smart WiFi Switch", 220, "Glass", true, "Automation");
        switch6.displayDetails();

        Switch switch7 = new Switch("Industrial Switch", 440, "Ceramic", false, "Heavy Machinery", 50.0);
        switch7.displayDetails();
    }
}