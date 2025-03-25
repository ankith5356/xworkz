class ChemicalsR {
    public static void main(String[] args) {
        Chemicals sub1 = new Chemicals();
        sub1.showDetails();

        Chemicals sub2 = new Chemicals("Ethanol");
        sub2.showDetails();

        Chemicals sub3 = new Chemicals("Ammonia", "NH3");
        sub3.showDetails();

        Chemicals sub4 = new Chemicals("Methane", "CH4", "Gas");
        sub4.showDetails();

        Chemicals sub5 = new Chemicals("Sulfuric Acid", "H2SO4", "Liquid", true);
        sub5.showDetails();

        Chemicals sub6 = new Chemicals("Calcium Carbonate", "CaCO3", "Solid", false, "Construction");
        sub6.showDetails();

        Chemicals sub7 = new Chemicals("Mercury", "Hg", "Liquid", true, "Thermometers", 13.6);
        sub7.showDetails();
    }
}
