package Ch6_Methods;

import java.util.Arrays;

public class Ch6_3_MethodOverloading {
    public static void main(String[] args) {
        /* Method overloading: aynı isimde birden fazla method yazmaktır.
         *                   Aynı isimde yazılan farklı methodların parametre listesinin farklı olması zorunludur
         *                  Method signature (method adı + parametre listesi) aynı olan iki method tanımlanamaz
         *
         *          - Overload edilmiş methodların hangisinin kullanılacağına java runtime'de karar verir.
         *
         *  */

        System.out.println(add(3.0, 2.0));
        System.out.println(add(3, 2));

        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));

    }

    // Method overloading
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    // parametre listesi üstteki add methodunun parametre listesi ile aynı olmadığı için sorun olmaz.
    public static double add(double d1, double d2) {
        return d1 + d2;
    }

    // Method overloading olmasaydı
    public static int addInts(int n1, int n2) {
        return n1 + n2;
    }

    public static double addDoubles(double n1, double n2) {
        return n1 + n2;
    }
}
