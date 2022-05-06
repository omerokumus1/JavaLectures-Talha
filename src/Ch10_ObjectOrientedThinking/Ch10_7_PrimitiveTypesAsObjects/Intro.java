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
        // TODO: Util class vs Wrapper class vs Extension Class
    }

    public static void format(double d) {
        // 1- ondalık basamak kontrolü
        // 2- format işlemini gerçekleştir
    }


}
