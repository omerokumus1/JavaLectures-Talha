package Ch10_ObjectOrientedThinking.Ch10_7_PrimitiveTypesAsObjects;

import java.util.ArrayList;

public class Intro {
    private ArrayList<Integer> list;
    /*
        wrapper class: var olan bir classı veya primitive datayı customize eden classtır. Herhangi bir class'tan oluşturulabilecek
            objelere veya primitive datalara özellik ekleyebilir veya istediğimiz herhangi bir özelliğinin kullanılmasını engelleyebiliriz.
     */

    public void add(Integer i) {
        // sıralı bir şekilde koyma işi yapılır
    }

    public void insert(Integer i, int index){
        Integer k = new Integer("123");
//        int k2 = "123";
        /*
        123 -> 123.00
        123.1 -> 123.10
        123.18 -> 123.18
        1- noktadan sonra kontrol yapılmalı
        2- hangi case'ye giriyorsa ona göre formatlama yapılmalı
         */
        Intro.format(123.2);
//        Test.format(123.2);
        int i1 = 3;
        Integer i2 = i1; // boxing
        i1 = i2; // unboxing
        long l = 1234_5678_9101L;
        // TODO: Util class vs Wrapper class vs Extension Class
        /*
            util class: projenin genelde tümünde kullanılan ortak methodların bulunduğu classtır
            Wrapper class: Projenin her yerinde değil ama belli bir alanında sürekli kullanılan fonksiyonları implement
                etmek için oluşturulur. Örn; SpecialString
            Extension class: Kullanım alanı aynı Wrapper class'lar gibidir. Tek farkı inheritance ile oluşturulmasıdır.
                Bazı classlar final olduğu için extend edilemez (Integer, String) bu durumlarda Wrapper class kulanılması gerekir.
                Extension classlarda otomatik olarak üst class'ın bütün özellikleri açıktır. Kapatmak istediğimiz bir method varsa
                    override edilerek kapatılabilir.
         */
        // Util class örnek
        // kullanıcıdan email aldık
        String email = "omerokumus@hotmail.com";
        StringUtil.isEmailFormatValid(email);
    }

    public static void format(double d) {
        // 1- ondalık basamak kontrolü
        // 2- format işlemini gerçekleştir
    }


}
