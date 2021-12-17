package Ch4;

import java.util.Arrays;
import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        char ch = 'A';
        ch = '?';
        ch = ' ';
        ch = '~';
        ch = 'A';
        System.out.println("ch: " + ch);
        System.out.println("int representation of A: " + (int) ch);

        int c = ch; // implicit casting, c = 65

        ch = 65; // implicit casting, ch = 'A'

        // string parsing
        String str = "Java programming is fun";
        String[] strSplit = str.split(" ");
        System.out.println(Arrays.toString(strSplit));
//        str.charAt(5) == ' '; // isSpace

        // Checking uppercase, lowercase and digits
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        ch = input.nextLine().charAt(0);
//
//        boolean isUppercase = 65 <= ch && ch <= 90;
//        boolean isLowercase = 97 <= ch && ch <= 122;
//        if (isUppercase)
//            System.out.println("It is an uppercase letter.");
//        else if (isLowercase)
//            System.out.println("It is an lowercase letter.");
//        else
//            System.out.println("It is not a letter.");
//
//
//        if (Character.isUpperCase(ch))
//            System.out.println("It is an uppercase letter.");
//        else if (Character.isLowerCase(ch))
//            System.out.println("It is an lowercase letter.");
//        else if (Character.isDigit(ch))
//            System.out.println("It is a digit.");
//        else
//            System.out.println("It is not a letter nor a digit.");


        // converting between uppercase and lowercase
        System.out.print("Enter a character: ");
        ch = input.nextLine().charAt(0);
        if (Character.isUpperCase(ch)){
            char lowercase = (char) (ch+32);
            System.out.println("Lowercase: " + lowercase);
        }
        else if (Character.isLowerCase(ch)){
            char uppercase = (char) (ch-32);
            System.out.println("Uppercase: " + uppercase);
        }
        else
            System.out.println("It is not a letter.");

        if (Character.isUpperCase(ch)){
            char lowercase = Character.toLowerCase(ch);
            System.out.println("Lowercase: " + lowercase);
        }
        else if (Character.isLowerCase(ch)){
            char uppercase = Character.toUpperCase(ch);
            System.out.println("Uppercase: " + uppercase);
        }
        else
            System.out.println("It is not a letter.");





    }
}
