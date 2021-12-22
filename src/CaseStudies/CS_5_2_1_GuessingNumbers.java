package CaseStudies;

import java.util.Scanner;

public class CS_5_2_1_GuessingNumbers {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int guess;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (true) { // indefinetly running loop
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            input.nextLine();
            counter++;
            if (guess == number) { // sentinel controlled loop
                System.out.printf("Bullseye! You got the number in %d times!\n", counter);
                System.out.println("Program ends.");
                break;
            } else {
                System.out.println("No it is not the number I have.");
                if (guess > number)
                    System.out.println("Go down");
                else
                    System.out.println("Go up");
            }
        }

        // Solution 2
//        System.out.print("Enter your guess: ");
//        guess = input.nextInt();
//        input.nextLine();
//        counter++;
//        while(guess != number){
//            System.out.println("No it is not the number I have.");
//            if (guess > number)
//                System.out.println("Go down");
//            else
//                System.out.println("Go up");
//            System.out.print("Enter your guess: ");
//            guess = input.nextInt();
//            input.nextLine();
//            counter++;
//        }
//        System.out.printf("Bullseye! You got the number in %d times!\n", counter);
//        System.out.println("Program ends.");

        // Solution 3
//        do {
//            System.out.print("Enter your guess: ");
//            guess = input.nextInt();
//            input.nextLine();
//            counter++;
//            if (guess == number) { // sentinel controlled loop
//                System.out.printf("Bullseye! You got the number in %d times!\n", counter);
//                System.out.println("Program ends.");
//            } else {
//                System.out.println("No it is not the number I have.");
//                if (guess > number)
//                    System.out.println("Go down");
//                else
//                    System.out.println("Go up");
//            }
//        } while (guess != number);
    }
}
