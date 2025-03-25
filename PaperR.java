class PaperR {
    public static void main(String paper[]) {
        Paper paper1 = new Paper();
        paper1.showDetails();

        Paper paper2 = new Paper("Letter");
        paper2.showDetails();

        Paper paper3 = new Paper("Legal", 80);
        paper3.showDetails();

        Paper paper4 = new Paper("Glossy", 100, "Blue");
        paper4.showDetails();

        Paper paper5 = new Paper("Newsprint", 50, "Gray", false);
        paper5.showDetails();

        Paper paper6 = new Paper("Cardstock", 200, "Red", true, "A3");
        paper6.showDetails();

        Paper paper7 = new Paper("Poster", 300, "Black", false, "A2", 15);
        paper7.showDetails();
    }
}
