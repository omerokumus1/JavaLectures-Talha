package Ch10_ObjectOrientedThinking.Ch10_2_ClassAbstraction;

public class LoanTest {
    public static void main(String[] args) {
        Loan defaultLoan = new Loan();
        defaultLoan.printDetails();
        System.out.println("\tMonthly Payment: " + defaultLoan.getMonthlyPayment());
        System.out.println("\tTotal Payment: " + defaultLoan.getTotalPayment());
    }
}
