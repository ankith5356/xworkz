class MetroR {
    public static void main(String[] city) {
        Metro metro1 = new Metro();
        metro1.showDetails();

        Metro metro2 = new Metro("London");
        metro2.showDetails();

        Metro metro3 = new Metro("Tokyo", 13);
        metro3.showDetails();

        Metro metro4 = new Metro("Paris", 16, "Green");
        metro4.showDetails();

        Metro metro5 = new Metro("Dubai", 5, "Red", false);
        metro5.showDetails();

        Metro metro6 = new Metro("Los Angeles", 2, "Yellow", true, "Private Operator");
        metro6.showDetails();

        Metro metro7 = new Metro("Shanghai", 18, "Blue", true, "Govt Owned", 1200);
        metro7.showDetails();
    }
}
