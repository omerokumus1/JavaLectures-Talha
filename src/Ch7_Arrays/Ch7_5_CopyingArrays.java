package Ch7_Arrays;

import java.util.Arrays;

public class Ch7_5_CopyingArrays {
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

        // referans kopyalaması
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numbersCopy = numbers;
        numbersCopy[0] = 100;
        System.out.println("Referans kopyalaması");
        System.out.println(numbers + Arrays.toString(numbers));
        System.out.println(numbersCopy + Arrays.toString(numbersCopy));

        // içerik kopyalaması
        // 1- döngülerle kopyalamak
        numbersCopy = new int[numbers.length]; // kopyalanacak dizinin uzunluğunda yeni bir array objesi oluştur
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }
        System.out.println("Döngülerle kopyamak");
        System.out.println(numbersCopy + Arrays.toString(numbersCopy));

        // 2- arraycopy methodu ile
        numbersCopy = new int[numbers.length];
        System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);
        System.out.println("arraycopy methodu ile kopyalamak");
        System.out.println(numbersCopy + Arrays.toString(numbersCopy));

        // 3- clone methodu ile
        numbersCopy = numbers.clone();
        System.out.println("clone methodu ile");
        System.out.println(numbersCopy + Arrays.toString(numbersCopy));


    }
}
