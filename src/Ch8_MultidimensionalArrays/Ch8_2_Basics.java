package Ch8_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch8_2_Basics {
    public static void main(String[] args) {
        // Declaration and initialization of 2-dimensional arrays
        int[] nums = new int[5];
        int[][] numberTable = new int[5][5];

        // Accessing members of 2-d array
        System.out.println(numberTable[2][0]);

        // Assigning to 2-d array
        numberTable[1][1] = -7;

        // 2D array creation by elements
        numberTable = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(numberTable[0][2]);
        System.out.println(numberTable[1][1]);
        System.out.println(numberTable[2][2]);

        // Obtaining row and column count
        int row = numberTable.length;
        int col = numberTable[0].length;
        System.out.println("row: " + row + ", col: " + col);

        // Each row is another array in 2d arrays
        int[] row0 = numberTable[0];
        int[] row1 = numberTable[1];
        int[] row2 = numberTable[2];

        // her bir satır başka bir arraydir
        System.out.println("row0: " + Arrays.toString(row0));
        System.out.println("row1: " + Arrays.toString(row1));
        System.out.println("row2: " + Arrays.toString(row2));

        // numberTable[2][3] -> numberTable[2] bir array döndürür. numberTable[2][3] ise numberTable[2]'nin
        // döndürdüğü array üzerinde 3. index'e gitmek demektir.

    }
}
