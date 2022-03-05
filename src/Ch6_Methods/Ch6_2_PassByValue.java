package Ch6_Methods;

public class Ch6_2_PassByValue {
    public static void main(String[] args) {
        // Pass-by-value: primitive tipteki değişkenler methodlara kopyalanarak gönderilir. Bundan dolayı methoddaki değişiklik
        // gönderilen yerde gözükmez
        int n = 7;
        multiplyByTwo(n);
        System.out.println("n in main: " + n); // n = 7

        n = multiplyByTwo2(n);
        System.out.println("n after return: " + n);

        // caller: method çağıran method
        // calee: çağırılan method
        // multiplyByTwo methodu callee olurken main içerisinde çağırdığımız için main method caller olur

        // Bir method çağırılınca kontrol caller'dan callee'ye geçer. Callee işini bitirince kontrolü caller'a devreder
    }

    public static void multiplyByTwo(int n) {
        n = 2 * n;
        System.out.println("n in method: " + n); // n = 14
    }

    public static int multiplyByTwo2(int n) {
        return 2 * n;
    }
}
