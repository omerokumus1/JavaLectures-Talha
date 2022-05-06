package Exercises;

import java.util.Scanner;

public class Ex5_41 {
    /*
    (Occurrence of max numbers) Write a program that reads integers, finds the largest
    of them, and counts its occurrences. Assume that the input ends with number
    0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
    is 5 and the occurrence count for 5 is 4.
     */

    public static void main(String[] args) {
        // Solution 1
        /** TO DO:
         *      1. Read numbers as string.
         *      2. Obtain numbers till the first 0
         *          2.1. Find the index of the first 0
         *          2.2. Get the substring until zero
         *      3. Find maximum number
         *      4. Count the occurrences of max number
         *      5. Display results
         */

        // 1. Read numbers as string.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String numbers = input.nextLine();

        // 2. Obtain numbers till the first 0
        // 5 2 1 8 0 21 0 78 56
        // 2.1. Find the index of the first 0
        int indexOfZero = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '0') {
                indexOfZero = i;
                break;
            }
        }
        // 2.2. Get the substring until zero
        numbers = numbers.substring(0, indexOfZero);

        // 3. Find maximum number
        // 5123 21 173 82322
        int max;
        int startIndex = 0, endIndex = 0;
        while (true) {
            if (numbers.charAt(endIndex) == ' ') {
                String maxString = numbers.substring(startIndex, endIndex);
                max = Integer.parseInt(maxString);
                break;
            }
            endIndex++;
        }

        startIndex = 0;
        endIndex = 0;
        int number;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ') {
                endIndex = i;
                String numberStr = numbers.substring(startIndex, endIndex);
                number = Integer.parseInt(numberStr);
                if (number > max)
                    max = number;
                startIndex = endIndex + 1;
            }
        }

        // 4. Count the occurrences of max number
        startIndex = 0;
        endIndex = 0;
        int maxCount = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == ' ') {
                endIndex = i;
                String numberStr = numbers.substring(startIndex, endIndex);
                number = Integer.parseInt(numberStr);
                if (number == max)
                    maxCount++;
                startIndex = endIndex + 1;

            }

        }

        System.out.println("Number sequence is " + numbers);
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence of the lasgest number is " + maxCount);


        // Solution 2
        /** TO DO:
         *      1. Read numbers indefinitely -> sentinel controlled loop with sentinel value of 0
         *      2. Count elements
         *          2.1. For the first iteration, the first elements is automatically the max and count is 1
         *          2.2. For the rest, compare max and current number.
         *              2.2.1. If currentNumber > max -> count = 1, max = currentNumber
         *                      else if currentNumber == max -> count++
         *                      else
         *      3. Display results
         */

        System.out.print("Enter numbers: ");
        int currentNumber;
        int iterationCount = 0;
        numbers = "";
        while(true){
            currentNumber = input.nextInt();
            if (currentNumber == 0)
                break;
            numbers += currentNumber + " ";
            if (iterationCount == 0){
                max = currentNumber;
                maxCount++;
            }
            else{
                if (currentNumber > max){
                    max = currentNumber;
                    maxCount = 1;
                } else{
                    maxCount++;
                }
            }
            iterationCount++;
        }

        System.out.println("Number sequence is " + numbers);
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence of the largest number is " + maxCount);

    }

}
