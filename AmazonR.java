public class AmazonR {
    public static void main(String[] args) {
       
        // Constructor Invokedz

        Amazon first=new Amazon();
        first.id=1;
        first.name="Anki";
        first.password="qwerty";
        first.number=947282728;
        System.out.println("Amazon id "+ first.id);
        System.out.println("Amazon Name "+ first.name);
        System.out.println("Amazon Password "+ first.password);
        System.out.println("Amazon number"+ first.number);

        Amazon second=new Amazon();
        second.id=2;
        second.name="Snax";
        second.password="qwertyu";
        second.number=947285728;
        System.out.println("\nAmazon id "+ second.id);
        System.out.println("Amazon Name "+ second.name);
        System.out.println("Amazon Password "+ second.password);
        System.out.println("Amazon number"+ second.number);
        
        
    }
}
