public class GovernmentIdR {

  public static void main(String[] args) {

    Government id1 = new Government();
    id1.id = 301;
    id1.holderName = "John Doe";
    id1.type = "Aadhar";
    id1.issuingAuthority = "Government of India";
    id1.expiryDate = "N/A";
    System.out.println("ID is " + id1.id);

    Government id2 = new Government();
    id2.id = 302;
    id2.holderName = "Jane Smith";
    id2.type = "Driving License";
    id2.issuingAuthority = "RTO Office";
    id2.expiryDate = "2030-05-10";
    System.out.println("ID is " + id2.id);
  }
}
