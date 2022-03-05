package Ch6_Methods;

public class Ch6_1_MethodsIntro {
    // Neden methodlar?
    /*  1- Kod okunulabilirliğini arttırır
        2- Kodun sürdürülebilirliğini arttırır
        3- Kodu daha kolay debug edebiliriz
        4- Kodda çıkabilecek hata sayısını azaltır
        5- Koda olan hakimiyet artar
        6- Kodun tekrar kullabilirliğini arttırır
     */

    public static void main(String[] args) {
        addTwoIntegers(5, 8); // method call, method invocation
        int result = addTwoIntegers2(5, 6);
        System.out.println("result: " + result);
    }

    /*
        public static -> ezber
        void -> değişkenlik gösteren alandır. her türlü veri tipi ve void yazılır. Örn; int, double, boolean, String, int[] vb..
        int n1, int n2 -> parametrelerdir. İstenildiği kadar parametre eklenebilir. parametre ismi keyfidir, tipi belirtilmedilir (int vb)
        {..} -> method body olarak geçer. Methodun yapacağı iş buraya kodlanır
     */
    public static void addTwoIntegers(int n1, int n2){
        System.out.println(n1 + n2);
    }

    // return yapan method
    public static int addTwoIntegers2(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }






}
