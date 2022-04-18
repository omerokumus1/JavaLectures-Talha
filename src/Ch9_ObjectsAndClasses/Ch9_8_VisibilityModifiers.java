package Ch9_ObjectsAndClasses;

public class Ch9_8_VisibilityModifiers {
    /*
        - Farklı classlardan veya paketlerden erişimleri düzenlemek için kullanılırlar.
        - public, private, protected, default (hiçbir şey yazılmaması)
            + public: methoda, constructora veya property'e her yerden erişilmesini sağlar
            + private: methoda, constructora veya property'e sadece bulunduğu class içerisinden erişilmesini sağlar
            + protected ve default inheritance konusundan sonra anlatılacak

        - Ne zaman public ne zaman private?
            + Bir methoda dışarıdan erişilmesi gerekiyorsa bu method public olmalı. Örn; Math.abs(), Math.pow()
            + Bir methoda dışarıdan erişilmesi gerekmiyorsa, methodun dışarıya açılması mantıklı değilse, methodu dışarıdan
                kullanmak anlamlı değilse, methodun dışarıdan kullanılması yasaklı ise private yapılır.

        - private constructor: Bir class'tan obje üretilmesini yasaklamak istiyorsan private constructor kullan.
            Örn;
            + Class içerisinde her şey static ise obje üretilmesini istemeyebilirsin
            + Singleton pattern: 1 tane obje üretmeye izin verir. Classtan obje istersin o sana var olanı getirir
     */
    public static void main(String[] args) {
        Math.pow(3, 7);
    }
}
