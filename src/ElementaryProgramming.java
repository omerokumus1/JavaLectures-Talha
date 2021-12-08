import java.util.Scanner;

public class ElementaryProgramming {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Variables
        // int i; -> Declaration, i = 5; -> Assignment
        int i = 5;
        int x; // Declaration
        x = 7; // Assignment

        // Primitive Data types: int, double, boolean, char, String
        /*
            int: Tam sayılar
            double: Ondalıklı sayılar
            boolean: true/false
            char: karakter (tek harf). '' içerisinde yazılır
            String: Karakterlerle oluşturulan her şey. "" içerisinde yazılır.
         */

        double d = 12.5;
        d = 17.54869548;
        boolean b1 = true;
        boolean b2 = false;
        char c1 = 'A';
        char c2 = 'a';
        char c3 = ' ';
        char c4 = '8';
        char c5 = '?';
        String s1 = "Java?";
        String s2 = "Java Programming!";
        String s3 = "Python Programming.";

        // Java is a case-sensitive language.
        // Literal: Bir değişkene atanabilecek bütün değerler literaldir.
        /*
            char c5 = '?'; -> '?' is a character literal
            String s1 = "Java?"; "Java?" is a string literal
            d = 17.54869548; -> 17.54869548 is double literal
            boolean b1 = true; -> true is a boolean literal
         */

        // Constant variables
        final int i1 = 5;
//        i1 = 7; -> wrong because i1 is final, i.e. cannot be changed.
        final double pi = 3.14;

        // Naming Notation: Camel Case -> areaOfCircleOne
        // Naming convention: choose meaningful names for variables and methods

        // Reading Input from Console
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int in1 = input.nextInt();
//        System.out.println("Entered number: " + in1);
//        System.out.print("Enter a double: ");
//        double d1 = input.nextDouble();
//        System.out.println("Entered double: " + d1);

//        System.out.print("Enter a string: ");
//        String str1 = input.nextLine();
//        System.out.println("String: "  + str1);

//        System.out.print("Enter a character: ");
//        String temp = input.nextLine();
//        char ch1 = temp.charAt(0);
////         char ch2 = input.nextLine().charAt(0);
//        System.out.println("Entered character: " + ch1);

        // Reading input from console SECURELY
        // Reading input in a wrong way
        // You cannot read string by the example below.
//        System.out.print("Enter an integer: ");
//        int i2 = input.nextInt();
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();

        // Reading input in a correct way
        // *** Input alırken nextLine kullanmıyorsan, bir sonraki input almadan önce nextLine() kullan.
//        System.out.print("Enter an integer: ");
//        int i2 = input.nextInt(); // input.nextLine();
////        input.nextLine();
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();
//        System.out.print("Enter a double: ");
//        double d2 = input.nextDouble();

        // Reading input in a correct way (2) ** preferred
        System.out.print("Enter an integer: ");
        int i2 = Integer.parseInt(input.nextLine());
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a double: ");
        double d2 = Double.parseDouble(input.nextLine());

    }
}
