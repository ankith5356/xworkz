public class PhotoFrame {


 
    public PhotoFrame() {
        System.out.println("\nVase Description is:");
    }


    public PhotoFrame(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

   
        String brand;
        double price;
        String size;
}