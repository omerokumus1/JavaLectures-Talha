package Ch7_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch7_10_ArraySearch {
    public static void main(String[] args) {
        // array search: bir array içerisinde belirli bir elemanı bulmak anlamına gelir
        /* Search çeşitleri
                1. Linear Search
                2. Binary Search
         */
        /* Array search özellikleri
            1. En kötü durumda tüm elemanlara bakmak zorunludur.
                En kötü durum olması için dizinin sıralı olmaması gerekir. Linear search tüm durumlarda çalışır
            2. En iyi durumda ise tüm elemanlara bakmadan aranılan eleman bulunabilir.
                En iyi durumda olması için dizinin sıralı olması gerekiyor. Binary search için dizinin sıralı olması gerekir

         */

        int[] nums = createArray();

        // 1- Linear Search
        System.out.println("4 is in arr: " + linearSearch(nums, 4));
        System.out.println("39 is in arr: " + linearSearch(nums, 39));
        System.out.println("88 is in arr: " + linearSearch(nums, 88));
        System.out.println("-5 is in arr: " + linearSearch(nums, -5));

        // Linear search for string: contains methodu linear search ile aranan stringi bulur
        String str = "Java is fun.";
        System.out.println("str contains f: " + str.contains("f"));
        System.out.println("str contains Ja: " + str.contains("Ja"));
        System.out.println("str contains f: " + charSearchInAString(str, 'f'));
        System.out.println("str contains k: " + charSearchInAString(str, 'k'));
        System.out.println("str contains j: " + charSearchInAString(str, 'j')); // case sentisive olduğu için false döner

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int e = 12;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = 8;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = 25;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = -4;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = 7;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = 1;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));
        e = 20;
        System.out.println("nums contains " + e + ": " + binarySearch(nums, e));

        e = 12;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = 8;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = 25;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = -4;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = 7;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = 1;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));
        e = 20;
        System.out.println("nums contains " + e + ": " + binarySearch2(nums, e));


    }

    private static boolean binarySearch(int[] arr, int e) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (true) {
            mid = (start + end) / 2;
            if (start + 1 == end){
                return arr[start] == e || arr[end] == e;
            }
            if (arr[mid] == e) // eleman bulundu
                return true;
            else if (arr[mid] > e)
                end = mid;
            else
                start = mid;
        }

    }
    private static boolean binarySearch2(int[] arr, int e) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (true) {
            mid = (start + end) / 2;
            if (start > end){
                return false;
            }
            if (arr[mid] == e) // eleman bulundu
                return true;
            else if (arr[mid] > e)
                end = mid-1;
            else
                start = mid+1;

        }

    }

    private static boolean charSearchInAString(String str, char ch) {
        final int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch)
                return true;
        }
        return false;
    }


    private static boolean linearSearch(int[] arr, int e) {
        for (int el :
                arr) {
            if (el == e)
                return true;
        }

        return false;
    }


    private static int[] createArray() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        return arr;
    }
}
