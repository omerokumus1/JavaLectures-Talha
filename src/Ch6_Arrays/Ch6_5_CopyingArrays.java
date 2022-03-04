package Ch6_Arrays;

public class Ch6_5_CopyingArrays {
    public static void main(String[] args) {
        // Arrayler birer objedir.
        // Objeler değişkenler vs RAM'de tutulur
        // RAM park alanları gibi alanlardan oluşur ve bu alanların ismi vardır. Adress denir ve sayısal olarak gösterilir.
        // Bir obje oluşturulduğun RAM'de bir alana koyulur ve bilgisayar bu objeyi nereye koyduğunu yani hangi adrese
        // yerleştirdiğini söyler. Bu adrese referans değeri denir. Biz de bu referans değerini değişkenlerde tutarız.
        // Yani değişken objenin kendisi değildir, objenin RAM'de nerede olduğunu söyler.

        int[] nums = new int[10];
        // nums arrayin kendisi değildir. nums arrayin RAM'de nerede olduğunu gösterir. Yani bulunduğu yerin adresini tutar
        System.out.println(nums); // [I@7c30a502 gibi bir sonuç üretir. Bu şu demektir; oluşturduğumuz array RAM'de [I@7c30a502 adresinde tutulur

        // Aslında şöyle düşünmek gerekir: nums değişkeninin gösterdiği obje. Fakat zaman içerisinde referans kavramı oturduğu için
        // "nums objesi" şeklinde söylenilir.



    }
}
