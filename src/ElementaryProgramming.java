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
//        System.out.print("Enter an integer: ");
//        int i2 = Integer.parseInt(input.nextLine());
//        System.out.print("Enter a string: ");
//        String str = input.nextLine();
//        System.out.print("Enter a double: ");
//        double d2 = Double.parseDouble(input.nextLine());

        // Reading integer sequence in one line
        // Örn; 5 3 4 8 9 {Enter}
        // Ex; Read 4 integers
//        System.out.print("Enter 4 integers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int e = input.nextInt();
//        input.nextLine();
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        System.out.println("c: " + c);
//        System.out.println("e: " + e);


        // String format. Ch4.6
        System.out.printf("Hello world!\n");

        // Format specifier: % ile belirtilir. Yanına koyulan harf ile veri tipi belirtilir.
        // %d -> integer
        // %s -> String
        // %f -> double, float
        // %c -> char
        String name = "Ömer";
        String school = "Marmara University";
        double gpa = 3.43;
        System.out.printf("Hi, my name is %s. I am studying at %s. My GPA is %f", name, school, gpa);
        System.out.println("Hi, my name is " + name + ". I am studying at " + school + ". My GPA is " + gpa);

        double d2 = 1 / 3.0;
        System.out.println("result: " + d2);
        System.out.printf("result: %.3f\n", d2);
        System.out.printf("%30s%30s\n", "Programming Language", "Release Date");
        System.out.printf("%30s%30s\n", "Java", "1990");
        System.out.printf("%30s%30s\n", "C", "1985");

        System.out.printf("%-30s%-30s\n", "Programming Language", "Release Date");
        System.out.printf("%-30s%-30s\n", "Java", "1990");
        System.out.printf("%-30s%-30s\n", "C", "1985");

        String str = "1230a";
        System.out.println(reverseNumericalString(str));


    }

    public static String reverseNumericalString(String str) {
        try {
            int number = Integer.parseInt(str); // To check if str is a numerical string
            String reversed = getReversed(str);
            number = Integer.parseInt(reversed); // Delete 0 at the beginning if there is one
            reversed = number + ""; // int to String casting
            return reversed;

        } catch (Exception e) {
            System.out.println(str + " is not a numerical string.");
            return str;
        }
    }

    public static String getReversed(String str) {
        int length = str.length();
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
