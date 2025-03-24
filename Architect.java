class Architect {
    public static void main(String[] args) {
        Blueprint.drawPlans();
    }
}

class Blueprint {
    public static void drawPlans() {
        Foundation.layBase();
    }
}

class Foundation {
    public static void layBase() {
        Construction.buildStructure();
    }
}

class Construction {
    public static void buildStructure() {
        Finishing.paintAndFurnish();
    }
}

class Finishing {
    public static void paintAndFurnish() {
        System.out.println("The house is ready to move in!");
    }
}
