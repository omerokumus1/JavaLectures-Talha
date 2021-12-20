package Ch5_Loops;

import java.util.Scanner;

public class JavaLoopsIntro {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // En genel tanımıyla döngü: verilen bir işi sürekli yapar. Bu iş için parametre değişikliği de yapabilir.

        // Ex: Parametre değişikliği
        // aşağıdaki stringteki a harflerini sayan programı yaz
        String str = "Java Programming";
        i = 0;
        int counter = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a') // iş: bir harfi kontrol etmek, parametre: i
                counter++;
            i++;
        }
        System.out.println("The number of a: " + counter);

//        do { // en az 1 kere çalışır
//
//        }while(booleanExp);

        // Aşağıdaki stringteki büyük harfleri sayan program
        str = "Java Programming";
        counter = 0;
        // j bu for için geçerlidir. Bu for döngüsünün dışında erişilemez. (scope, lifetime)
        for (int j = 0; j < str.length(); j++) {
            if (65 <= str.charAt(j) && str.charAt(j) <= 90)
                counter++;
        }
        System.out.println("The number of capital letters: " + counter);

        // ne zaman for ne zaman while?
        // Herhangi bir özel durum karşısında döngü bitecekse for kullan, counter ile döngüyü bitiriyorsan for.
        // while kullanılması için örnek (Sentinel-controlled loop)
        // Hesap makinesi örneği: Inputlar düzgün girilecek, kullanıcı isterse hesap makinasını bitirecek
        // yani gelen inputa göre
        Scanner input = new Scanner(System.in);
        int n1, n2;
        String s1;
        String op;
        String result = "";
        while (true) {
            System.out.println("To quit, enter q");
            System.out.print("Enter first number: ");
            s1 = input.nextLine();
            if (s1.charAt(0) == 'q') { // q is the sentinel value.
                System.out.println("Calculator is shutdown.");
                break;
            }
            n1 = Integer.parseInt(s1);
            System.out.print("Enter second number: ");
            n2 = Integer.parseInt(input.nextLine());
            System.out.print("Enter operator: ");
            op = input.nextLine();
            if (op.equals("+")) { // if-else zincirindeki conditionlar aynı yapıya sahipse switch kullan
                result = (n1 + n2) + "";
//                System.out.println("result: " + result); // duplicate code, ortak kodları if-else zincirinin dışına koy
            }
            else if (op.equals("-")) {
                result = (n1 - n2) + "";
//                System.out.println("result: " + result);
            }
            else if (op.equals("*")) {
                result = (n1 * n2) + "";
//                System.out.println("result: " + result);
            }
            else if (op.equals("/")) {
                result = ((double) n1 / n2) + "";
//                System.out.println("result: " + result);
            }
//            else // result initialize edilmemişse bu blok olmak zorunda
//                result = "NaN";
            System.out.println("result: " + result);

        }


    }
}
