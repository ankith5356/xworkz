public class BankAc {
    static double balance ;

    // Credit
    public static void credit(double amount){
        System.out.println("Credit Started");
        if(amount > balance){
        balance = balance + amount;
        System.out.println("The Amount Credited is : "+balance);
        }
        else
        System.out.println("Amount Invalid"); 

        System.out.println("Credit Ended");
    }


    //Debit
    public static void debit(double amount){
        System.out.println("Debit Started");
        if(amount <= balance){
        balance=balance-amount;
        System.out.println("The Amount Debited is : "+balance);
    }
        else
        System.out.println("Amount Not Debited"); 

        System.out.println("Debit Ended");
    }

    //Balance
   public static void getBalance(){
        System.out.println(balance);
   }
}
