package Ch7_Arrays;

public class Ch7_1_ArraysIntro {
    public static void main(String[] args) {

        // 1- Array oluşturmak

        // declaration of arrays
//        elementType[] name;
        int[] intArray;
        double[] doubleArray;
        String[] stringArray;
        boolean[] booleanArray;
        char[] charArray;
        // byte short etc.

        // Object type
        Character[] characters;

        // Creation of arrays
        // name = new elementType[arraySize];
        intArray = new int[5]; // size 5'tir. Zorunludur çünkü kullanılmadan önce size'ın bilinmesi gerekir.

        // ** Array'i kullanmadan önce bir şekilde size'sini bilmen/hesaplaman gerekiyor.

        // tek satırda array oluşturmak
        int[] ints = new int[10]; // tüm elemanlar 0 olur çünkü integer için default değer 0'dır.
        // boolean array olsaydı hepsi false olurdu çünkü boolean için default değer false'dir


        // Bilinen elemanlarla array oluşturmak
        int[] ints1 = {1, 2, 3, 4, 5, 6}; // eleman sayısı otomatik olarak array size olur. Örn; bu array'in boyutu 6'dır
        // 0. index -> 1, 1. index -> 2, 2. index -> 3, ...

        // 2- Elemanlara Erişmek
        // arrayler indexlenebilir. Index değeri ile elemanlara erişmek mümkündür.
        System.out.println("ints1'in 1. indexindeki eleman: " + ints1[1]);
        System.out.println("ints1'in 2. indexindeki eleman: " + ints1[2]);
        System.out.println("ints1'in 3. indexindeki eleman: " + ints1[3]);
        System.out.println("ints1'in 4. indexindeki eleman: " + ints1[4]);

        int sum = ints1[1] + ints1[2];
        System.out.println("ints1[1] + ints1[2]: " + sum);

        String[] strArray = {"Trabzon", "İstanbul", "İzmir", "LA", "Boston"};
        String cities = strArray[1] + strArray[2];
        System.out.println(cities);

        String[] numbers = {"1", "2", "3", "4"};
        int firstEl = Integer.parseInt(numbers[0]);


        // 3- Array'e eleman atamak
        ints1[0] = 22;
        System.out.println(ints1[0]);





    }
}
