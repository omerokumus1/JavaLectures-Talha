package Ch6_Methods;

public class Ch6_ExercisePasswordGenerator {
    public static void main(String[] args) {
        /*
            TODO:
                1. Küçük harf üreten bir method yaz
                2. Büyük harf üreten bir method yaz
                3. Sayı üreten bir method yaz
                4. Özel karakter üreten bir method yaz
                5. Rastgele bir şekilde bu methodları çağır ve gereken uzunlukta şifre oluştur
         */
        System.out.println(generatePassword(10));
    }

    // 1. Küçük harf üreten bir method yaz
    public static char generateLowercaseLetterByASCII() {
        int random = (int) (Math.random() * 26 + 97);
        return (char) random;
    }
//
//    public static char generateLowercaseLetterByString() {
//
//    }

    // 2. Büyük harf üreten bir method yaz
    public static char generateUppercaseLetterByASCII() {
        int random = (int) (Math.random() * 26 + 65);
        return (char) random;
    }

    //    public static char generateUppercaseLetterByString() {
//
//    }

    // 3. Sayı üreten bir method yaz
    public static int generateDigit() {
        return (int) (Math.random() * 10);
    }

    // 4. Özel karakter üreten bir method yaz
    public static char generateSpecialCharacter(){
        String specialChars = ".,?-=)(/&%+^!;:+*";
        int index = (int) (Math.random() * specialChars.length());
        return specialChars.charAt(index);
    }

    // 5. Rastgele bir şekilde bu methodları çağır ve gereken uzunlukta şifre oluştur
    public static String generatePassword(int length){
        String password = "";
        int random;
        for (int i = 0; i < length; i++) {
            random = (int)(Math.random() * 4);
            switch (random){
                case 0: password += generateLowercaseLetterByASCII(); break;
                case 1: password += generateUppercaseLetterByASCII(); break;
                case 2: password += generateDigit(); break;
                case 3: password += generateSpecialCharacter(); break;
            }
        }
        return password;
    }

}
