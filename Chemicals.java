class Substances {
    // Instance Variables
    private String compoundName;
    private String chemicalFormula;
    private String phase;
    private boolean isHazardous;
    private String application;
    private double massDensity;

    // Default Constructor (No arguments)
    public Substances() {
        this("Oxygen"); // Calls the constructor with a single parameter
        System.out.println("No-argument constructor invoked");
    }

    // Constructor with 1 Parameter (Compound Name)
    public Substances(String compoundName) {
        this(compoundName, "O2"); // Default formula for Oxygen
        System.out.println("1-parameter constructor invoked");
    }

    // Constructor with 2 Parameters (Compound Name, Chemical Formula)
    public Substances(String compoundName, String chemicalFormula) {
        this(compoundName, chemicalFormula, "Gas"); // Default phase as Gas
        System.out.println("2-parameter constructor invoked");
    }

    // Constructor with 3 Parameters (Compound Name, Chemical Formula, Phase)
    public Substances(String compoundName, String chemicalFormula, String phase) {
        this(compoundName, chemicalFormula, phase, false); // Default hazardous state as false
        System.out.println("3-parameter constructor invoked");
    }

    // Constructor with 4 Parameters (Compound Name, Chemical Formula, Phase, Hazardous)
    public Substances(String compoundName, String chemicalFormula, String phase, boolean isHazardous) {
        this(compoundName, chemicalFormula, phase, isHazardous, "Medical"); // Default application
        System.out.println("4-parameter constructor invoked");
    }

    // Constructor with 5 Parameters (Compound Name, Chemical Formula, Phase, Hazardous, Application)
    public Substances(String compoundName, String chemicalFormula, String phase, boolean isHazardous, String application) {
        this(compoundName, chemicalFormula, phase, isHazardous, application, 1.43); // Default mass density
        System.out.println("5-parameter constructor invoked");
    }

    // Main Constructor (Fully Parameterized)
    public Substances(String compoundName, String chemicalFormula, String phase, boolean isHazardous, String application, double massDensity) {
        this.compoundName = compoundName;
        this.chemicalFormula = chemicalFormula;
        this.phase = phase;
        this.isHazardous = isHazardous;
        this.application = application;
        this.massDensity = massDensity;
        System.out.println("\nFully parameterized constructor invoked");
    }

    // Method to display substance details
    public void showDetails() {
        System.out.println("Compound Name: " + compoundName);
        System.out.println("Chemical Formula: " + chemicalFormula);
        System.out.println("Phase: " + phase);
        System.out.println("Hazardous: " + (isHazardous ? "YES" : "NO"));
        System.out.println("Application: " + application);
        System.out.println("Mass Density: " + massDensity + " g/L");
        System.out.println("------------------------------");
    }
}
