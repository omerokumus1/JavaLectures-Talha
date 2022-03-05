package Ch6_Methods;

import java.util.Arrays;

public class Ch6_Exercise1 {
    public static void main(String[] args) {
        // HW4- Rastgele elemanlarla 10 elemanlı dizi oluştur bu dizide en büyük sayıyı bul
        /* TODO:
                1. Rastgele elemanlarla dizi oluşturan bir method tanımla
                2. En büyük sayıyı bulan method tanımla

         */

        int[] numbers = createRandomArray();
        int max = findMax(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("max: " + max);
    }

    // 1. Rastgele elemanlarla dizi oluşturan bir method tanımla
    public static int[] createRandomArray() {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }

        return randomArray;
    }

    // 2. En büyük sayıyı bulan method tanımla
    public static int findMax(int[] array){
        int max = array[0];
        for (int el :
                array) {
            if (el > max)
                max = el;
        }

        return max;
    }
}
