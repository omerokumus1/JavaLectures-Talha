package Ch4;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Java programming is fun.    ";
        // length of a string
        str.length();

        // toLowercase
        str.toLowerCase();

        // toUppercase
        str.toUpperCase();

        // charAt
        str.charAt(2);

        // trim
        System.out.println("trimmed version of '" + str + "' is '" + str.trim() + "'");

        // concat
        String str2 = str + "I enjoy it so much.";
        System.out.println(str2);
        String str3 = str.concat("I enjoy it so much.");
        System.out.println(str3);

        //*** equals
        System.out.println("str2.equals(str3): " + str2.equals(str3));
        System.out.println("str2 == str3 : " + (str2 == str3));
//        str2.equalsIgnoreCase(str3);

        // compareTo
        int result = str.compareTo(str2); // str < str2 -> negative number, str = str2 -> zero, str > str2 -> positive number


    }
}
