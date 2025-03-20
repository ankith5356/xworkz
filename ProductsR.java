public class ProductsR {

  public static void main(String[] args) {

    Products prod1 = new Products();
    prod1.id = 501;
    prod1.name = "Laptop";
    prod1.price = 75000;
    prod1.category = "Electronics";
    prod1.brand = "Dell";
    System.out.println("ID is " + prod1.id);

    Products prod2 = new Products();
    prod2.id = 502;
    prod2.name = "Smartphone";
    prod2.price = 50000;
    prod2.category = "Electronics";
    prod2.brand = "Samsung";
    System.out.println("ID is " + prod2.id);
  }
}
