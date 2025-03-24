
// Arrays

public class SuperMarket {
    public static void main(String[] args) {

        String Fruits[]={"Apple","Bannana","Custard","Litchi","Mango"};
        String Snacks[]={"Uncle Chips","Pringles","Lays","Biscuits","CharMuri"};
        String Vegetables[]={"Tomato","Brinjal","LadyFinger","Onion","Ginger"};
        String Stationeries[]={"Pen","Pencil","Eraser","Sharpner","Whitener"};
        String alchols[]={"Black&White","Old Monk","Oxygen","MCD"};

        // Length of Fruits
        System.out.println("Total Number of Fruits added: " +Fruits.length); //Finding Length

        System.out.println("The fruit i got from supermarket is " +Fruits[2]);

        System.out.println("The fruits i got from supermarket is " +Fruits[2]+" "+Fruits[1]+" "+Fruits[4]+" "+Fruits[3]);// Printing more than one value in basic 

        // System.out.println("The fruit i got from supermarket is " + Arrays.toString(Fruits));

        // Snacks
        System.out.println("The Snack i  got  from supermarket is " +Snacks[2]);

        // Vegies
        System.out.println("The Vegetable i got from supermarket is " +Vegetables[0]);
        
        // Statioanry
        System.out.println("The Stationary i  got  from supermarket is " +Stationeries[2]);

        // Alcohols
        System.out.println("Total no of Alcohols added " +alchols.length);


        // for(String alchols1 : alchols){
        //     System.out.println(alchols1);
        // }
        
        System.out.println("The Alcohols i  got  from supermarket is "+alchols[0]+" "+alchols[2]+" "+alchols[3]+" "+alchols[1]+" ");
        System.out.println("The Alcohol i  got  from supermarket is " +alchols[2]);


    }
}
