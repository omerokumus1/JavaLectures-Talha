package Ch8_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ch8_3_Processing2DArrays {
    public static void main(String[] args) {
        // 1. Initializing arrays with input values.
//        initArrayWithInputs();

        // 2. Inıtializing arrays with random numbers
        initArrayWithRandomNumbers();

        // 3. Print 2D array
        print2dArray();

        // 4. Summing all elements
        sumAllElements();

        // 7. Random shuffling
        shuffle2dArray();
    }

    private static void shuffle2dArray() {
        System.out.println("\n7. Random shuffling");
        int[][] numberTable = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Random random = new Random();
        int randRow, randCol;
        for (int row = 0; row < numberTable.length; row++) {
            for (int col = 0; col < numberTable[0].length; col++) {
                randRow = random.nextInt(numberTable.length);
                randCol = random.nextInt(numberTable[0].length);
                swapElements(numberTable, row, col, randRow, randCol);
            }
        }
        printTable(numberTable);
    }

    private static void swapElements(int[][] numberTable, int row, int col, int randRow, int randCol) {
        int temp = numberTable[row][col];
        numberTable[row][col] = numberTable[randRow][randCol];
        numberTable[randRow][randCol] = temp;
    }

    private static void sumAllElements() {
        System.out.println("\n4. Summing all elements");
        int[][] numberTable = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int row = 0; row < numberTable.length; row++) {
            for (int col = 0; col < numberTable[0].length; col++) {
                sum += numberTable[row][col];
            }
        }
        System.out.println("sum: " + sum);

    }

    private static void print2dArray() {
        System.out.println("\n3. Print 2D array");
        int[][] numberTable = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < numberTable.length; row++) {
            for (int col = 0; col < numberTable[0].length; col++) {
                System.out.printf("%3d", numberTable[row][col]);
            }
            System.out.println();
        }

    }

    private static void initArrayWithRandomNumbers() {
        System.out.println("\n2. Inıtializing arrays with random numbers");
        Random random = new Random();
        int[][] numberTable = new int[3][4];
        for (int row = 0; row < numberTable.length; row++) {
            for (int col = 0; col < numberTable[0].length; col++) {
                numberTable[row][col] = random.nextInt(20);
            }
        }
        printTable(numberTable);
    }

    private static void initArrayWithInputs() {
        System.out.println("1. Initializing arrays with input values.");
        Scanner input = new Scanner(System.in);
        int[][] numberTable = new int[2][3];
        for (int i = 0; i < numberTable.length; i++) { // numberTable.length = row count
            for (int j = 0; j < numberTable[0].length; j++) {
                System.out.print("Enter int: ");
                numberTable[i][j] = input.nextInt();
                input.nextLine();
            }
        }
        printTable(numberTable);
    }

    private static void printTable(int[][] numberTable) {
        for (int[] row : numberTable) {
            System.out.println(Arrays.toString(row));
        }
    }
}
