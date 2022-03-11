package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_6_PassingArraysToMethods {
    public static void main(String[] args) {
        // Arrayler pass-by-reference ile methodlara gönderilir. Genel olarak objeler pass-by-reference ile gider
        /* pass-by-reference: methodlara objelerin referansları gönderilir. Referans sayesinde objelere erişilip değişiklik yapılabilir
         *               Pass-by-reference ile objelerde yapılan değişiklikler HER YERDE görülür çünkü kopyalama durumu yoktur. Objenin
         *               kendisine/orjinal haline işlem yapılır
         * */

        int[] nums = {1, 2, 3, 4, 5};
        doubleEachElement(nums);
        System.out.println(Arrays.toString(nums)); // 2 4 6 8 10
    }

    private static void doubleEachElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * 2; // burada yapılan değişiklik her yerde gözükür
        }
    }
}
