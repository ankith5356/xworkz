package com.xworkz.showroom;

public class ShowRun {

        public static void main(String[] args) {
            // Creating Staff Members
            Staff staff1 = new Staff();
            staff1.staffId = 201;
            staff1.staffName = "Rahul";
            staff1.staffAddress = "Bangalore";

            Staff staff2 = new Staff();
            staff2.staffId = 202;
            staff2.staffName = "Priya";
            staff2.staffAddress = "Mumbai";

            Staff staff3 = new Staff();
            staff3.staffId = 203;
            staff3.staffName = "Arjun";
            staff3.staffAddress = "Chennai";

            Staff staff4 = new Staff();
            staff4.staffId = 204;
            staff4.staffName = "Sneha";
            staff4.staffAddress = "Delhi";

            // Creating Managers
            Manager manager1 = new Manager();
            manager1.managerId = 1;
            manager1.managerName = "Mr. Sharma";
            manager1.staffMembers = new Staff[]{staff1, staff2};

            Manager manager2 = new Manager();
            manager2.managerId = 2;
            manager2.managerName = "Ms. Radhika";
            manager2.staffMembers = new Staff[]{staff3, staff4};

            // Creating ShowRoom
            ShowRoom showRoom = new ShowRoom();
            showRoom.showroomId = 101;
            showRoom.showroomName = "Xworkz Auto Showroom";
            showRoom.managers = new Manager[]{manager1, manager2};

            // Displaying Details
            showRoom.displayDetails();
        }
    }


