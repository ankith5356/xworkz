package com.xworkz.showroom;

public class ShowRoom {
        public int showroomId;
        public String showroomName;
        public Manager[] managers;

        public void displayDetails() {
            System.out.println("ShowRoom ID: " + showroomId);
            System.out.println("ShowRoom Name: " + showroomName);
            System.out.println("Managers in this showroom: ");

            for (Manager manager : managers) {
                manager.showDetails();
            }
        }
    }


