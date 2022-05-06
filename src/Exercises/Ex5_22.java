package Exercises;

import java.util.Scanner;

public class Ex5_22 {
    public static void main(String[] args) {
        /*
        The monthly payment for a
        given loan pays the principal and the interest. The monthly interest is computed
        by multiplying the monthly interest rate and the balance (the remaining principal).
        The principal paid for the month is therefore the monthly payment minus
        the monthly interest. Write a program that lets the user enter the loan amount,
        number of years, and interest rate and displays the amortization schedule for the loan
         */

        /** TO DO:
         *      1. Read loan amount, number of years, interest rate
         *      2. Compute monthly interest as monthlyInterest = monthlyInterestRate * balance
         *      3. balance = monthly payment - monthly interest
         *
         */

        // 1. Read loan amount, number of years, interest rate
        Scanner input = new Scanner(System.in);
        int loanAmount = 10000, numberOfYears = 1, interestRate = 7;
//        System.out.print("Loan amount: ");
//        loanAmount = input.nextInt(); input.nextLine();
//        System.out.print("Number of Years: ");
//        numberOfYears = Integer.parseInt(input.nextLine());
//        System.out.print("Annual interest Rate: ");
//        interestRate = Integer.parseInt(input.nextLine());
        double monthlyInterestRate = interestRate / 12.0;

        int balance = loanAmount;
        double monthlyPayment = monthlyInterestRate * balance / 100.0 * 12;
        double totalPayment = monthlyPayment * 12;
        System.out.println("Monthly payment: " + monthlyPayment);
        System.out.println("totalPayment: " + totalPayment);
        double interest, principal;
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Payment#", "Interest", "Principal", "Balance");
        for (int i = 0; i < numberOfYears*12; i++) {
            System.out.printf("%-10d", i+1);
            interest = monthlyPayment * monthlyInterestRate;
            System.out.printf("%-10f", interest);
        }

    }
}
