public class BellR {
    public static void main(String[] args) {
        Bell b1 = new Bell();
        b1.brand = "TempleTone";
        b1.price = 500.00;
        b1.material = "Brass";
        System.out.println("Bell Brand is " + b1.brand);
        System.out.println("Bell Price is " + b1.price);
        System.out.println("Bell Material is " + b1.material);

        Bell b2 = new Bell();
        b2.brand = "MelodyChime";
        b2.price = 800.00;
        b2.material = "Copper";
        System.out.println("Bell Brand is " + b2.brand);
        System.out.println("Bell Price is " + b2.price);
        System.out.println("Bell Material is " + b2.material);

        Bell b3 = new Bell();
        b3.brand = "HarmoniSound";
        b3.price = 1200.00;
        b3.material = "Iron";
        System.out.println("Bell Brand is " + b3.brand);
        System.out.println("Bell Price is " + b3.price);
        System.out.println("Bell Material is " + b3.material);

        Bell b4 = new Bell();
        b4.brand = "RusticRings";
        b4.price = 950.00;
        b4.material = "Wood";
        System.out.println("Bell Brand is " + b4.brand);
        System.out.println("Bell Price is " + b4.price);
        System.out.println("Bell Material is " + b4.material);

        Bell b5 = new Bell();
        b5.brand = "SilverEcho";
        b5.price = 1500.00;
        b5.material = "Silver";
        System.out.println("Bell Brand is " + b5.brand);
        System.out.println("Bell Price is " + b5.price);
        System.out.println("Bell Material is " + b5.material);

        Bell b6 = new Bell();
        b6.brand = "WindChime";
        b6.price = 700.00;
        b6.material = "Aluminum";
        System.out.println("Bell Brand is " + b6.brand);
        System.out.println("Bell Price is " + b6.price);
        System.out.println("Bell Material is " + b6.material);

        Bell b7 = new Bell();
        b7.brand = "GoldenCharm";
        b7.price = 1800.00;
        b7.material = "Gold-plated";
        System.out.println("Bell Brand is " + b7.brand);
        System.out.println("Bell Price is " + b7.price);
        System.out.println("Bell Material is " + b7.material);


        bell b8=new Bell("Gold",4000,"Gold-Silver-Plated");
        System.out.println("Brand is " +b8.brand);
        System.out.println("Bell Price is " + b8.price);
        System.out.println("Bell Material is " + b8.material);


         bell b9=new Bell("Bronze",800,"Bronze-Plated");
        System.out.println("Brand is " +b9.brand);
        System.out.println("Bell Price is " + b9.price);
        System.out.println("Bell Material is " + b9.material);

        bell b10=new Bell("Rusty",8000,"Rusty-Plated");
        System.out.println("Brand is " +b10.brand);
        System.out.println("Bell Price is " + b10.price);
        System.out.println("Bell Material is " + b10.material);

        
    }
}


