class HouseR {
    public static void main(String[] house) {
        House house1 = new House();
        house1.showDetails();

        House house2 = new House("Villa");
        house2.showDetails();

        House house3 = new House("Bungalow", 5);
        house3.showDetails();

        House house4 = new House("Cottage", 2, "Blue");
        house4.showDetails();

        House house5 = new House("Townhouse", 4, "Red", false);
        house5.showDetails();

        House house6 = new House("Mansion", 10, "Beige", true, "Countryside");
        house6.showDetails();

        House house7 = new House("Penthouse", 6, "Gray", true, "City Center", 1200000);
        house7.showDetails();
    }
}
