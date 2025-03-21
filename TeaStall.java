public class TeaStall {
    static String name="baba's Tea Stall";
    public static void main(String[] args) {
        System.out.println("The Stall 1 Name is "+name);

         name="Babu 1 Tea Stall "; // Re-Initialize OR Update.
        //  update();
        System.out.println("Name after re-init");
        System.out.println("The Stall 2 Name is "+name);
    }

    public static void update(){
        name="Babu 3 Tea Stall";
    }
}
