package com.xworkz.SuperMarket;

import com.xworkz.Product.Prod;

public class Section {
    public int sectionId;
    public String sectionName;
    public Prod[] products;
    public Prod[] Prods;

    public void showDetails() {
        System.out.println("  Section ID: " + sectionId);
        System.out.println("  Section Name: " + sectionName);
        System.out.println("  Products available in this section: ");

        for (Prod product : products) {
            product.displayInfo();
        }
    }
}
