public class HospitalR {

  public static void main(String[] args) {

    Hospital hos1 = new Hospital();
    hos1.id = 401;
    hos1.name = "Apollo Hospital";
    hos1.location = "Bangalore";
    hos1.noOfBeds = 500;
    hos1.specialty = "Cardiology";
    System.out.println("ID is " + hos1.id);

    Hospital hos2 = new Hospital();
    hos2.id = 402;
    hos2.name = "Fortis Hospital";
    hos2.location = "Delhi";
    hos2.noOfBeds = 700;
    hos2.specialty = "Neurology";
    System.out.println("ID is " + hos2.id);
  }
}
