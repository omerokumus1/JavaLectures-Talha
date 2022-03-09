package Ch6_Methods;

public class Ch6_4_ScopeOfVariables {
    /*
            block: {} ile oluşturulan alana denir.
            Scope of variables:
                                - Değişkenler tanındığı aralıktır. Bu aralık dışında değişkenlere erişilemez
                                - Değişkenlerin erişilebilir olduğu aralıktır.
                                - Değişkenler kendisini kapsayan (declare edildiği) en küçük block'ta tanımlıdır.
                                    Aynı zamanda tanımlandığı satırdan sonraki satırlarda erişilebilir
            Local variables: if, while, do-while, for, ve methodlar içerisinde tanımlanan değişkenler local değişken olarak
                                isimlendirilir. Bu değişkenler tanımlandığı bloğa localdir yani o block dışında erişilemez

         */
    public static void main(String[] args) {


        if (true) {
            int y; // y değişkeni bu block dışında erişilemez
        }
//        System.out.println(y); // y değişkeni if bloğuna localdir. bu sebeple o block dışında erişilemez.

        int y; // kendisini kaplayan en küçük block main method bloğudur. bundan sebep main methodun her yerinde erişilebilir.
        // ama dışında erişilemez
        if (true) {
            y = 3;
        }
        System.out.println(y); // y erişilebilir

        // döngüler içinde aynı şey geçerlidir.
        for (int i = 0; i < 10; i++) { // i değişkeni for bloğuna localdir
            int j = 2; // j değişkeni for bloğuna localdir
        }
//        System.out.println(i); // local olduğu bloğun dışında olduğu için erişilemez
//        System.out.println(j); // local olduğu bloğun dışında olduğu için erişilemez

//        System.out.println(x); // x'e bloğu dışında erişemeyiz
    }

    public static void f() {
        int x = 3; // bu değişkeni kapsayan en küçük block f methodunun bloğudur. O zaman bu değişken f methodunun local değişkenidir.
        // Bu sebeple  bu block dışında erişilemez
    }
}
