public class Stove {
    
    Stove(){
        System.out.println("\n Stove Details");
    }
    Stove(String brand, double price , String model){

        this.brand=brand;
        this.price=price;
        this.model=model;
    }

    String brand;
    double price;
    String model;
}
