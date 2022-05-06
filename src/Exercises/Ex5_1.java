package Exercises;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        /*
        Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number.
         */


        // Solution 1

        /** TO DO:
         *      1. Create a sentinel controlled loop
         *      2. Read inputs ***
         *      3. Process numbers one by one
         *          3.1. if number is positive then count it with a variable
         *          3.2. if number is negative then count it with a variable
         *          3.3. if number is 0, then break the loop
         *      4. Find average and total
         *      5. Display results
         */

        Scanner input = new Scanner(System.in);
        int number, positiveNumberCount = 0, negativeNumberCount = 0, sum = 0;
        // 1. Create a sentinel controlled loop
        System.out.print("Enter an integer, the input ends if it is 0:");
        while (true) {
            // 2. Read inputs ***
            number = input.nextInt();
            // Testing
//            System.out.println("number: " + number);
            // 3.3. if number is 0, then break the loop
            if (number == 0) { // sentinel is 0
                break;
            }
            // 3.2. if number is negative then count it with a variable
            if (number < 0) {
                negativeNumberCount++;
            }
            // 3.1. if number is positive then count it with a variable
            else if (number > 0) {
                positiveNumberCount++;
            }
            sum += number;

        }
        input.nextLine(); // clear buffer
        int totalNumber = positiveNumberCount + negativeNumberCount;
        double avg = (double) sum / totalNumber;
        System.out.println("The number of positives is " + positiveNumberCount);
        System.out.println("The number of negatives is " + negativeNumberCount);
        System.out.println("Total is " + sum);
        System.out.println("The average is " + avg);


        // Solution 2
        /** TO DO:
         *      1. Read input as a string
         *      2. Split the string by space **
         *      3. Move over the elements and process them
         */



        // 1. Read input as a string
        System.out.print("Enter an integer, the input ends if it is 0:");
        String numberString = input.nextLine();

        // 2. Split the string by space **
        String[] numbers = numberString.split(" "); // space is delimiter -> inputları birbirinden ayıran karakter ya da karakter dizisi

        // Testing
//        System.out.println(Arrays.toString(numbers));

        // 3. Move over the elements and process them
        positiveNumberCount = 0;
        negativeNumberCount = 0;
        sum = 0;
        int numberInt;
        for (String str: numbers) {
            if (str.equals("0"))
                break;
            numberInt = Integer.parseInt(str);
            if (numberInt < 0)
                negativeNumberCount++;
            else if (numberInt > 0)
                positiveNumberCount++;

            sum += numberInt;
        }
        totalNumber = positiveNumberCount + negativeNumberCount;
        avg = (double) sum / totalNumber;
        System.out.println("The number of positives is " + positiveNumberCount);
        System.out.println("The number of negatives is " + negativeNumberCount);
        System.out.println("Total is " + sum);
        System.out.println("The average is " + avg);

        // Performance increase
        // Her iterasyon için methodun değeri aynı kalıyorsa bir değişkene atayıp o değişkeni kullan
//        for (int i = 0; i < numberString.length(); i++) { // her döngü başında length() fonk. çalışır, performans düşer
//
//        }
//        // DÜZELTME
        // length() fonk. değeri her iterasyon için aynıdır çünkü uzunluk değişmiyor. Bu sebeple sonucu length değişkenine atayıp kullandık
//        int length = numberString.length();
//        for (int i = 0; i < length; i++) {
//
//        }

    }
}
