public class BubbleGum {

    BubbleGum() {
        System.out.println("\n Bubble Gum Description");
    }

    BubbleGum(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    String brand;
    String color;
    int price;
}
