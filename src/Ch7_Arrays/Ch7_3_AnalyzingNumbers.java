package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_3_AnalyzingNumbers {
    public static void main(String[] args) {
        // The problem is to write a program that finds the number of items above the average of
        // all items.

    /*  TO DO:
            1. Create a random array
            2. Find the average of the array
            3. Find numbers that are greater than the average
     */
        // 1. Create a random array
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // arrayin içine eleman atılacaksa normal for döngüsü kullanılmalıdır çünkü index gereklidir
            numbers[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(numbers));

        // 2. Find the average of the array
        double sum = 0;
        for (int e : // Arrayin elemanlarına sadece erişim olduğu için foreach kullandık. Index'e ihtiyacımız yok çünkü
                numbers) {
            sum += e;
        }
        double avg = sum / numbers.length;
        System.out.println("Average: " + avg);

        // 3. Find numbers that are greater than the average
        for (int e : // Arrayin elemanlarına sadece erişim olduğu için foreach kullandık. Index'e ihtiyacımız yok çünkü
                numbers) {
            if (e > avg)
                System.out.print(e + " ");
        }
    }

}
