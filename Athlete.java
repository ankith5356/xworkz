class Athlete {
    public static void main(String[] args) {
        Training.startTraining();
    }
}

class Training {
    public static void startTraining() {
        Nutrition.followDietPlan();
    }
}

class Nutrition {
    public static void followDietPlan() {
        Rest.getEnoughSleep();
    }
}

class Rest {
    public static void getEnoughSleep() {
        Race.runMarathon();
    }
}

class Race {
    public static void runMarathon() {
        System.out.println("Congratulations! You finished the marathon!");
    }
}
