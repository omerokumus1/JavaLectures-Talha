package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_11_ArraySort {
    public static void main(String[] args) {
        int[] nums = {2, 9, 5, 4, 8, 1, 6};
        int[] nums2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        selectionSort(nums);
//        bubbleSort2(nums);
        insertionSort2(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void insertionSort2(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            slideElementLeft(nums, i);
        }
        System.out.println("Counter: " + counter);
    }

    private static void slideElementLeft(int[] nums, int i) {
        for (int j = i; j >= 0 && nums[j + 1] < nums[j]; j--) {
            swapConsecutiveElements(nums, j); // swap j and j+1
            System.out.println(Arrays.toString(nums));
//                counter++;
        }
    }

    private static void insertionSort(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                int j = i;
                while (j >= 0 && nums[j + 1] < nums[j]) {
                    swapConsecutiveElements(nums, j); // swap j and j+1
                    System.out.println(Arrays.toString(nums));
                    j--;
                    counter++;
                }
            } else
                counter++;
        }
        System.out.println("counter: " + counter);
    }

    private static void bubbleSort(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1])
                    swapConsecutiveElements(nums, j);
                counter++;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(counter);
    }

    private static void bubbleSort2(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1])
                    swapConsecutiveElements(nums, j);
                counter++;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(counter);
    }

    private static void bubbleSort3(int[] nums) {
        int indexOfMin = findMinIndex(nums);
        int counter = 0;
        for (int i = 0; i < indexOfMin; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1])
                    swapConsecutiveElements(nums, j);
                counter++;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(counter);
    }

    private static void bubbleSort4(int[] nums) {
        int counter = 0;
        boolean isSorted;
        for (int i = 0; i < nums.length - 1; i++) {
            isSorted = true;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swapConsecutiveElements(nums, j);
                    isSorted = false;
                }
                counter++;
            }
            System.out.println(Arrays.toString(nums));
            if (isSorted)
                break;
        }
        System.out.println(counter);
    }

    private static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[minIndex])
                minIndex = i;
        }
        return minIndex;
    }


    private static void swapConsecutiveElements(int[] nums, int i) {
        int temp = nums[i];
        nums[i] = nums[i + 1];
        nums[i + 1] = temp;
    }

    private static void selectionSort(int[] arr) {
        int minIndex, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            // find min
            for (int j = i; j < arr.length; j++) { // s??ralanmam???? dizi i??erisinde minimum eleman?? bul
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

    private static void selectionSort2(int[] arr) {
        int minIndex;
        for (int startIndex = 0; startIndex < arr.length - 1; startIndex++) {
            // find min
            minIndex = findMinIndex(arr, startIndex);
            // swap
            swapElements(arr, startIndex, minIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swapElements(int[] arr, int startIndex, int minIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    private static int findMinIndex(int[] arr, int startIndex) {
        int minIndex = startIndex;
        for (int j = startIndex; j < arr.length; j++) { // s??ralanmam???? dizi i??erisinde minimum eleman?? bul
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        return minIndex;
    }
}
