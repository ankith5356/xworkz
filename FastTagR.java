public class FastTagR {

  public static void main(String[] args) {

    FastTag tag1 = new FastTag();
    tag1.id = 901;
    tag1.ownerName = "Rahul Sharma";
    tag1.vehicleNumber = "KA-05-AB-1234";
    tag1.balance = 500;
    tag1.provider = "Paytm";
    System.out.println("ID is " + tag1.id);


    FastTag tag2 = new FastTag();
    tag1.id = 902;
    tag1.ownerName = "Mukesh Sharma";
    tag1.vehicleNumber = "KA-06-AB-1834";
    tag1.balance = 8000;
    tag1.provider = "HDFC";
    System.out.println("ID is " + tag2.id);


    FastTag tag3 = new FastTag();
    tag1.id = 903;
    tag1.ownerName = "Rahul Sharma";
    tag1.vehicleNumber = "KA-08-AB-1237";
    tag1.balance = 200;
    tag1.provider = "Canara";
    System.out.println("ID is " + tag3.id);
  }
}
