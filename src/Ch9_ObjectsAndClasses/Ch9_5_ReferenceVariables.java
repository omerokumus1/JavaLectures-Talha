package Ch9_ObjectsAndClasses;

import Ch9_ObjectsAndClasses.Ch9_1_Intro.Circle;

public class Ch9_5_ReferenceVariables {

    public static void main(String[] args) {
    /*
        - ClassName varName = new ClassName(); ile obje ürettiğimizde varName isimli değişken objenin kendisi değildir
            objenin memorydeki adresini yani nerede bulunduğunu bize söyler. Bu değişkene reference variable denir.

        - Reference variable sayesinde objeye erişip üzerinde işlem yapabiliriz

        - Reference variable objenin kendisi değildir! Objenin bulunduğu yeri gösterir!
     */
        Circle c = new Circle();
        System.out.println(c); // @ ile başlayan bir sayı basar. Örn; @49e4cb85. Bu sayı objenin memoryde koyulduğu
                                // yerin numarasıdır (adresidir)
        c.getRadius();


        /*  Reference types vs Primitive types
            Reference types: Objelerdir -> arrayler, String, kendi oluşturduğumuz classlar
            Primitive types: int, double, boolean, char vb tiplerdir. Bunlar küçük harfle başlar ve turuncu olarak gösterilir (arrayler hariç)

            Primitive tipler değerin direkt kendisini tutar ve değişkenin kendisiyle direkt olarak değere erişişlirken
            reference tipler ise objenin referans değerini tutar ve bu referans değeri aracılığıyla objeye erişilir.
         */

        /* Garbage, Garbage Collection and Garbage Collector
            - Garbage: Kullanımı biten objelerdir. Örn; Program akışında bir yere kadar kullanılıp ondan sonra daha kullanılmayan
                obje varsa garbage olur.
            - Garbage collection: Garbage olan objelerin toplanması işidir.
            - Garbage collector: Garbage olan objeleri toplayan objedir.
         */

    }
}
