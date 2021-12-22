package CaseStudies;

public class CS_5_11_PrimeNumbers {
    public static void main(String[] args) {
        // Find prime numbers upto a limit
        // Solution 1 - Top-down Approach
        /* TODO:
                1. Specify the limit
                2. Start with 2 go upto the limit one by one
                3. For each number, check if it is a prime number.
                4. If a number is prime then display, else do not display
         */

        // 1. Specify the limit
        int LIMIT = 100;
        boolean isPrime;
        // 2. Start with 2 go upto the limit one by one
        for (int number = 2; number < 100; number++) {
            isPrime = true;
            // 3. For each number, check if it is a prime number.
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            // 4. If a number is prime then display, else do not display
            if (isPrime)
                System.out.print(number + " ");

        }

        // HW: Write a program that finds perfect numbers (mükemmel sayı) between 0 and 10000


    }
}
