package Ch6_Methods;

import java.util.Arrays;

public class Ch6_Exercise2 {
    public static void main(String[] args) {
        // Bir stringin içerisindeki büyük harfleri sayan method
        String str = "Java Programming is fuN.";
        int capitalLetters = countCapitalLetters(str);
        System.out.println(capitalLetters);
        countCapitalLetters2(str);

        // Bir stringin içerisinde büyük harfleri gösteren method
        String capitals =  findCapitalLetters(str);
        System.out.println("capitals: " + capitals);
        findCapitalLetters2(str);

        char[] capitalsArr = findCapitalLetters3(str);
        System.out.println("capitalsArr: " + Arrays.toString(capitalsArr));
        findCapitalLetters4(str);
    }

    public static char[] findCapitalLetters3(String str){
        int size = countCapitalLetters(str);
        char[] capitalLetters = new char[size];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                capitalLetters[j] = str.charAt(i);
                j++;
            }
        }

        return capitalLetters;
    }

    public static void findCapitalLetters4(String str){
        int size = countCapitalLetters(str);
        char[] capitalLetters = new char[size];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                capitalLetters[j] = str.charAt(i);
                j++;
            }
        }
        System.out.println("capitalsArr in method: " + Arrays.toString(capitalLetters));
    }


    public static String findCapitalLetters(String str){
        String capitalLetters = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                capitalLetters += str.charAt(i);
        }

        return capitalLetters;
    }

    public static void findCapitalLetters2(String str){
        String capitalLetters = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                capitalLetters += str.charAt(i);
        }
        System.out.println("capital in method: " + capitalLetters);
    }


    public static int countCapitalLetters(String str){
        int capitalLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                capitalLetters++;
        }
        return capitalLetters;
    }

    public static void countCapitalLetters2(String str){
        int capitalLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                capitalLetters++;
        }
        System.out.println("capital letter count : " + capitalLetters);
    }
}
