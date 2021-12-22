package CaseStudies;

import java.util.Scanner;

public class CS5_10_CheckingPalindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Solution 1
        /* TODO:
            1. Reverse the string
            2. Check the equality of the strings
            3. If string and its reversed version are the same, then it is a palindrome, else it is not
         */
        // 1. Reverse the string
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // 2. Check the equality of the strings
        boolean areEqual = str.equals(reversedStr);

        // 3. If string and its reversed version are the same, then it is a palindrome, else it is not
        if (areEqual)
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");

        // Solution 2
        /*  TODO:
                1. Repeatedly check characters from the last and the beginning
                2. If you found an unmatch, then it is not a palindrome, else it is a palindrome
         */
        // flag: herhangi bir kararı veya bir sonucu sonraki satırlara taşımaya yarar.
        boolean isPalindrome = true; // isPalindrome değişkeni bir flag'dir. aşağıdaki if bloğunun çalıştığını sonraki satırlara hatırlatır.
        int lastIndex = str.length() - 1;
        for (int i = 0; i <= lastIndex; i++) {
            char fromBeginning = str.charAt(i);
            char fromLast = str.charAt(lastIndex - i);
            if (fromBeginning != fromLast) {
                System.out.println(str + " is not a palindrome");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println(str + " is a palindrome");


    }
}
