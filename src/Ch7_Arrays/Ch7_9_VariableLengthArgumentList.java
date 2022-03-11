package Ch7_Arrays;

import java.lang.reflect.Array;

public class Ch7_9_VariableLengthArgumentList {
    public static void main(String[] args) {
        int sum1To5 = sum(1, 2, 3, 4, 5);
        int sum1To3 = sum(1, 2, 3);
        int sum4To12 = sum(4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("sum1To3: " + sum1To3);
        System.out.println("sum1To5: " + sum1To5);
        System.out.println("sum4To12: " + sum4To12);
    }

    // Bir methodda sadece 1 tane variable-length argument olabilir
    // variable-length argument methoddaki en son eleman olmalı
    public static int sum(int... numbers) {
        int sum = 0;
        for (int e :
                numbers) {
            sum += e;
        }
        return sum;
    }
}
