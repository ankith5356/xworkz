package com.xworkz.superR;
import com.xworkz.Product.Prod;
import com.xworkz.SuperMarket.Section;

public class SuperRun {
        public static void main(String[] args) {
            // Creating Prods
            Prod Prod1 = new Prod();
            Prod1.ProdId = 101;
            Prod1.ProdName = "Oreo Biscuit";
            Prod1.ingredients = new String[]{"Flour", "Sugar", "Cocoa"};

            Prod Prod2 = new Prod();
            Prod2.ProdId = 102;
            Prod2.ProdName = "Lays Chips";
            Prod2.ingredients = new String[]{"Potato", "Oil", "Salt"};

            Prod Prod3 = new Prod();
            Prod3.ProdId = 103;
            Prod3.ProdName = "Colgate Toothpaste";
            Prod3.ingredients = new String[]{"Fluoride", "Calcium Carbonate", "Mint"};

            // Creating Sections
            Section section1 = new Section();
            section1.sectionId = 1;
            section1.sectionName = "Snacks";
            section1.Prods = new Prod[]{Prod1, Prod2};

            Section section2 = new Section();
            section2.sectionId = 2;
            section2.sectionName = "Personal Care";
            section2.Prods = new Prod[]{Prod3};

            // Creating SuperMarket
            SuperMarket superMarket = new SuperMarket();
            superMarket.marketId = 1;
            superMarket.marketName = "Xworkz SuperMart";
            superMarket.sections = new Section[]{section1, section2};

            // Displaying Details
            superMarket.displayDetails();
        }
    }


