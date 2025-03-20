public class PoliceStationR {

  public static void main(String[] args) {

    PoliceStation ps1 = new PoliceStation();
    ps1.id = 801;
    ps1.name = "Connaught Place Police Station";
    ps1.location = "Delhi";
    ps1.noOfOfficers = 50;
    ps1.jurisdiction = "Central Delhi";
    System.out.println("ID is " + ps1.id);

    PoliceStation ps2 = new PoliceStation();
    ps2.id = 802;
    ps2.name = "Koramangala Police Station";
    ps2.location = "Bangalore";
    ps2.noOfOfficers = 60;
    ps2.jurisdiction = "South Bangalore";
    System.out.println("ID is " + ps2.id);
  }
}
