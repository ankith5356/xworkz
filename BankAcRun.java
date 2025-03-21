public class BankAcRun {
    public static void main(String[] args) {
        System.out.println("Main Started");

        BankAc.getBalance();

        BankAc.credit(1000);

        BankAc.getBalance();

        BankAc.debit(544);

        BankAc.getBalance();

        System.out.println("Main Ended");
    }
}
