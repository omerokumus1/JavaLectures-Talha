package Exercises;

import java.util.Scanner;

public class Ex5_14_GCD {
    public static void main(String[] args) {
        // Write a program that prompts the user to enter two positive integers and displays the gcd.
        /** TODO:
         *      1. Read two integers
         *      2. Find gcd of two integers
         *          2.1. Find minimum of two integer to be assigned as limit
         *          2.2. Start from 1 to limit, check every number if it divides both integers.
         *              2.2.1. If true then keep the number, else skip the number
         *      3. Display gcd
         *
         */

        // 1. Read two integers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter second number: ");
        int n2 = Integer.parseInt(input.nextLine());

        // 2.1. Find minimum of two integer to be assigned as limit
        int limit = Math.min(n1, n2);
        // 2.2. Start from 1 to limit, check every number if it divides both integers.
        int gcd = 1;
        for (int i = 1; i <= limit; i++) {
            // 2.2.1. If true then keep the number, else skip the number
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        System.out.println("gcd: " + gcd);

        // 21, 28 21->1,3,7,21  28->1,2,4,7,28
    }
}
