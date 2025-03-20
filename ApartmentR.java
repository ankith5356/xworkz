
public class ApartmentR {

    public static void main(String[] args) {

        Apartment1 first = new Apartment1();
        first.id = 201;
        first.firstName = "Sunshine Residency";
        first.address = "Mumbai";
        first.noOfBlocks = 5;
        first.noOfFlats = 50;
        System.out.println("ID is " + first.id);

        Apartment1 second = new Apartment1();
        second.id = 202;
        second.firstName = "Ocean View";
        second.address = "Goa";
        second.noOfBlocks = 3;
        second.noOfFlats = 30;
        System.out.println("ID is " + second.id);
    }
}
