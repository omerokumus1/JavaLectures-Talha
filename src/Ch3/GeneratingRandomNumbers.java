package Ch3;

public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        double n = Math.random(); // -> 0 <= n < 1

        // Generate numbers between 0 and 12
        // 0 <= n < 1 -- x12 -> 0x12 <= n*12 < 1x12 -> 0 <= 12n < 12 -> 0 <= n < 12
        n = Math.random() * 12; // 0 <= n < 12

        // Generate number between -17 and 0
        n = Math.random() * (-17);
        // * Çarpma ile üretilebilecek sayı alanı genişletilir

        // Generate number between 3 and 24
        // 1. Aralığın genişliğini bul: 24-3 = 21 -> Math.random()*21
        // 2. Başlangıç noktasını kaydır: 0+3 = 3
        n = Math.random() * 21 + 3; // Math.random()*21 -> 0 <= n < 21, Math.random()*21 +3 -> 3 <= n < 24

        // integer sayı üretmek
        int r = (int) n;

        // Sonuç: Tek satırda integer sayı üretmek
        // 45 ile 97 arasında tam sayı üret
        // 97-45 = 52
        // +45
        r = (int) (Math.random() * 52 + 45);


    }
}
