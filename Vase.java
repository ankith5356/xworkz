public class Vase {
    Vase(){
        System.out.println("\n Vase Description is:");
    }

    Vase(String brand,double price,String material){
        this.brand=brand;
        this.price=price;
        this.material=material;
    }


    String brand;
    double price;
    String material;
   
}
