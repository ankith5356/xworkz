public class Vegie {
    static  String Vegetables[]={"Tomato","Brinjal","LadyFinger","Onion","Ginger"};

   static String Fruits[]={"Apple","Bannana","Custard","Litchi","Mango"};
    public static void main(String[] args) {
        System.out.println("Main Started : ");

        getVeg();

        getFru();

        System.out.println("Main Ended  : ");
    }

   
    public static void getVeg(){
        System.out.println("Start of Vegetable  ");

        for(String vegies1:Vegetables){
            System.out.println(vegies1);

        }
        System.out.println(" End of Vegetable  ");
    }
   
     // Fruits

    public static void getFru(){
        System.out.println("\n Start of Fruits  ");

        for(String fruits1:Fruits){
            System.out.println(fruits1);

        }
        System.out.println("End of Fruits ");
    }
}
