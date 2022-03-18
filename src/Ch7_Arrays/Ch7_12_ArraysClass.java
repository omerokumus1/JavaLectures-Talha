package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_12_ArraysClass {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] numsCopy = Arrays.copyOf(nums, 5);
        System.out.println("numsCopy: " + Arrays.toString(numsCopy));
        numsCopy = Arrays.copyOf(nums, nums.length + 10);
        System.out.println("numsCopy: " + Arrays.toString(numsCopy));
        numsCopy = Arrays.copyOfRange(nums, 5, 10);
        System.out.println("numsCopy: " + Arrays.toString(numsCopy));
        Arrays.fill(numsCopy, -1); // hatalı kod kontrolü yapmak için kullanılabilir.
        System.out.println("numsCopy: " + Arrays.toString(numsCopy));

    }
}
