package com.xworkz.superR;

import com.xworkz.SuperMarket.Section;

public class SuperMarket {
    public int marketId;
    public String marketName;
    public Section[] sections;

    public void displayDetails() {
        System.out.println("SuperMarket ID: " + marketId);
        System.out.println("SuperMarket Name: " + marketName);
        System.out.println("Sections available: ");

        for (Section section : sections) {
            section.showDetails();
        }
    }
}
