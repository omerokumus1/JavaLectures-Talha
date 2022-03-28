package Ch8_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ch8_3_Processing2DArrays {
    public static void main(String[] args) {
        // 1. Initializing arrays with input values.
        Scanner input = new Scanner(System.in);
        int[][] numberTable = new int[2][3];
        for (int i = 0; i < numberTable.length; i++) { // numberTable.length = row count
            for (int j = 0; j < numberTable[0].length; j++) {
                System.out.print("Enter int: ");
                numberTable[i][j] = input.nextInt();
                input.nextLine();
            }
        }
        for (int[] nums: numberTable) {
            System.out.println(Arrays.toString(nums));
        }
    }
}
