package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_11_ArraySort {
    public static void main(String[] args) {
        int[] nums = {2, 9, 5, 4, 8, 1, 6};
        selectionSort2(nums);
    }

    private static void selectionSort(int[] arr){
        int minIndex, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            // find min
            for (int j = i; j < arr.length; j++) { // sıralanmamış dizi içerisinde minimum elemanı bul
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            // swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void selectionSort2(int[] arr){
        int minIndex;
        for (int startIndex = 0; startIndex < arr.length - 1; startIndex++) {
            // find min
            minIndex = findMinIndex(arr, startIndex);
            // swap
            swapElements(arr, startIndex, minIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swapElements(int[] arr,  int startIndex, int minIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    private static int findMinIndex(int[] arr, int startIndex){
        int minIndex = startIndex;
        for (int j = startIndex; j < arr.length; j++) { // sıralanmamış dizi içerisinde minimum elemanı bul
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        return minIndex;
    }
}
