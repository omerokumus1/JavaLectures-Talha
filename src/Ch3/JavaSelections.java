package Ch3;

import java.util.Scanner;

public class JavaSelections {
    public static void main(String[] args) {
        int a = -5;
        int b = 3;
        if (a < b) {
            if (5 == 4) {

            }
        } else if (a == b) {

        } else {

        }

        if (a < b)
            System.out.println("a < b");
        System.out.println();

        if (a < b) // completely useless
            if (5 == 5)
                System.out.println("5 == 5");
            else if (2 < 5)
                System.out.printf("2 < 5");
            else
                System.out.println("none of them above");

        boolean bool = a < b;
        if (bool){

        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        boolean isLowercaseLetter = 65 <= ch && ch <= 90;
        boolean isUppercaseLetter = 97 <= ch && ch <= 122;
        boolean isValidCharacter = isLowercaseLetter || isUppercaseLetter;
        if (isValidCharacter){ // clean code approach
            System.out.println("valid character");
//            System.out.println("Program ends.");
        }
        else{
            System.out.println("Invalid character");
//            System.out.println("Program ends.");
        }
        System.out.println("Program ends.");

        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 0.5);
        System.out.println(x);

        boolean even;
        if (ch % 2 == 0)
            even = true;
        else
            even = false;

        even = 8 % 2 == 0;



    }
}
