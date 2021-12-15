package Ch3;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        /*
        BMI < 18.5 Underweight
        18.5 ≤ BMI < 25.0 Normal
        25.0 ≤ BMI < 30.0 Overweight
        30.0 ≤ BMI Obese
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = input.nextDouble(); input.nextLine();
        System.out.print("Enter height: ");
        double height = Double.parseDouble(input.nextLine());
        System.out.println();
        double bmi = weight / (height * height);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (18.5 <= bmi && bmi < 25)
            System.out.println("Normal");
        else if (25 <= bmi && bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }
}
