public class Shampoo {
    Shampoo(){
        System.out.println("\n Shampoo Details are: ");
    }

    Shampoo(String type, String usage, int quantity){
        this.type=type;
        this.usage=usage;
        this.quantity=quantity;
    }

    String type;
    String usage;
    int quantity;
}
