package com.xworkz.Product;

public class Prod {
        public int productId;
        public String productName;
        public String[] ingredients;
    public int ProdId;
    public String ProdName;

    public void displayInfo() {
            System.out.println("    Product ID: " + productId);
            System.out.println("    Product Name: " + productName);
            System.out.print("    Ingredients: ");

            for (String ingredient : ingredients) {
                System.out.print(ingredient + " ");
            }
            System.out.println();
        }
    }


