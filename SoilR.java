class SoilR {
    public static void main(String[] args) {
        Soil soil1 = new Soil();
        soil1.displayDetails();

        Soil soil2 = new Soil("Sandy");
        soil2.displayDetails();

        Soil soil3 = new Soil("Clay", "Red");
        soil3.displayDetails();

        Soil soil4 = new Soil("Silt", "Gray", 7.0);
        soil4.displayDetails();

        Soil soil5 = new Soil("Peaty", "Dark Brown", 4.5, false);
        soil5.displayDetails();

        Soil soil6 = new Soil("Chalky", "White", 8.0, false, "Coarse");
        soil6.displayDetails();

        Soil soil7 = new Soil("Saline", "Light Brown", 9.0, false, "Loose", 10.5);
        soil7.displayDetails();
    }
}