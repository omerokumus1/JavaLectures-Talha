package Ch6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessingArrays {
    public static void main(String[] args) {
        // 1- Initializing array with input values
//        int[] numbers = new int[5];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter an integer");
//            numbers[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(numbers)); // Displaying array -> Arrays.toString(arrayName)
//
        // 2- Initializing array with random numbers
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random()*100);
//        }
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);


    }
}
