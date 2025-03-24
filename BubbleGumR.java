public class BubbleGumR {
    public static void main(String[] args) {

        BubbleGum gum1 = new BubbleGum();
        gum1.brand = "BOOMER";
        gum1.color = "PINK";
        gum1.price = 1;
        System.out.println("Bubble Gum brand is " + gum1.brand);
        System.out.println("Bubble Gum Color is " + gum1.color);
        System.out.println("Bubble Gum Price is " + gum1.price);

        BubbleGum gum2 = new BubbleGum();
        gum2.brand = "Center Fruit";
        gum2.color = "Blue";
        gum2.price = 2;
        System.out.println("Bubble Gum brand is " + gum2.brand);
        System.out.println("Bubble Gum Color is " + gum2.color);
        System.out.println("Bubble Gum Price is " + gum2.price);

        BubbleGum gum3 = new BubbleGum();
        gum3.brand = "Double Mint";
        gum3.color = "White";
        gum3.price = 50;
        System.out.println("Bubble Gum brand is " + gum3.brand);
        System.out.println("Bubble Gum Color is " + gum3.color);
        System.out.println("Bubble Gum Price is " + gum3.price);
    }
}
