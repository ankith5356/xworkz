package com.xworkz.fitness;

import GymManager.GymManager;

public class FitnessCent {

        public int centerId;
        public String centerName;
        public GymManager manager;

        public void fetchDetails(){
            System.out.println("Fitness Center ID is " + centerId);
            System.out.println("Fitness Center Name is " + centerName);
            System.out.println("Manager details are: ");
            manager.getDetails();
        }
    }


