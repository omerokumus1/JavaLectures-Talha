package Exercises;

public class Ex5_18 {
    public static void main(String[] args) {
        // Pattern A
//        int limit = 6;
//        int number;
//        for (int row = 0; row < limit; row++) {
//            number = 1;
//            for (int col = 0; col < row + 1; col++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }

        // Pattern B
//        int limit = 6;
//        int number;
//        for (int row = 0; row < limit; row++) {
//            number = 1;
//            for (int i = 0; i < limit - row; i++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }
//

        // Pattern C
//        int limit = 6;
//        int number;
//        for (int row = 0; row < limit; row++) {
//            number = 1;
//            for (int col = 0; col < limit - row - 1; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 0; col < row + 1; col++) {
//                System.out.print(number + " ");
//                number++;
//            }
//            System.out.println();
//        }

        // Pattern D
        int limit = 8;
        int number;
        for (int row = 0; row < limit; row++) {
            number = 1;
            for (int col = 0; col < row; col++) {
                System.out.printf("%4s", "   ");
            }
            for (int col = 0; col < limit - row; col++) {
                System.out.printf("%4s", number);
                number*=2;
            }
            System.out.println();
        }
    }
}
