public class SalonR {

  public static void main(String[] args) {

    Salon salon1 = new Salon();
    salon1.id = 701;
    salon1.name = "Looks Unisex Salon";
    salon1.location = "Mumbai";
    salon1.servicesOffered = "Haircut, Spa, Makeup";
    salon1.priceRange = 5000;
    System.out.println("ID is " + salon1.id);

    Salon salon2 = new Salon();
    salon2.id = 702;
    salon2.name = "Lakme Salon";
    salon2.location = "Chennai";
    salon2.servicesOffered = "Skincare, Haircare, Beauty";
    salon2.priceRange = 7000;
    System.out.println("ID is " + salon2.id);
  }
}
