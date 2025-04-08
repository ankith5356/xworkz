package com.xworkz.showroom;

public class Manager {

        public int managerId;
        public String managerName;
        public Staff[] staffMembers;

        public void showDetails() {
            System.out.println("  Manager ID: " + managerId);
            System.out.println("  Manager Name: " + managerName);
            System.out.println("  Staff under this manager: ");

            for (Staff staff : staffMembers) {
                staff.displayInfo();
            }
        }
    }


