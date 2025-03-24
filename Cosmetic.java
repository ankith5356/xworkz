public class Cosmetic {
    Cosmetic(){
        System.out.println("\n Cosmetic Description are:");
    }

    Cosmetic(String brand, double price,String type){
        this.brand=brand;
        this.price=price;
        this.type=type;
    }

    String brand;
    double price;
    String type;
}
