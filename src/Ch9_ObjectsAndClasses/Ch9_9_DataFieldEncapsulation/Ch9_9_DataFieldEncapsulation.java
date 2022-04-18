package Ch9_ObjectsAndClasses.Ch9_9_DataFieldEncapsulation;

public class Ch9_9_DataFieldEncapsulation {
    /*
        - Tüm property'lerin private olması demektir
        - private alanlar dışarıdan erişime kapalı olacağından ötürü erişime açmak için farklı yapılara ihtiyaç vardır.
            Bu yapılar getter ve setter yapılarıdır
                + getter: private olan property'i dışarıya verir
                + setter: private olan property'nin değerini değiştirir.

        - Neden encapsulation?: Logic implement etmek için -> property'lerin alaibileceği değerleri mantıksal olarak sınırlandırmak için
            bir kontrol mekanizması oluşturarak hatalı atamaların önüne geçilebilir
            Örn; private olmayan bir radius için circle.radius = -4; ile negatif radius atanabilir ama private olan bir radius için
                setter methoduna negatif sayıları kabul etmeyen bir kod yazılarak bunun önüne geçilir.
     */
}
