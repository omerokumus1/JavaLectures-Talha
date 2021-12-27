package Exercises;

public class Ex5_24 {
    public static void main(String[] args) {
        int limit = 97;
        double sum = 0;
        for (int i = 1; i < limit; i += 2) {
            if (i % 11 == 0)
                System.out.println();
            if (i != 95)
                System.out.print(i + "/" + (i + 2) + " + ");
            else
                System.out.print(i + "/" + (i + 2));

            sum += (double) i / (i + 2);

        }
        System.out.printf("\n%.3f", sum);
    }
}
