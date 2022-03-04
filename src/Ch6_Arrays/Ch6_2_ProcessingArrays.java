package Ch6_Arrays;

public class Ch6_2_ProcessingArrays {
    public static void main(String[] args) {
        // 1- Initializing array with input values
//        int[] numbers = new int[5];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Enter an integer");
//            numbers[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(numbers)); // Displaying array -> Arrays.toString(arrayName)
//
        // 2- Initializing array with random numbers
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = (int) (Math.random()*100);
//        }
//        System.out.println(Arrays.toString(numbers));

        // 4- Summing all elements
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("Sum: " + sum);

        // 7- Random shuffling (deste karıştırmak gibi)
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int r, temp;
//        for (int i = 0; i < numbers.length; i++) {
//            r = (int) (Math.random() * numbers.length); // arrayin içerisinde bir index üretir
//
//            // swap
//            temp = numbers[i];
//            numbers[i] = numbers[r];
//            numbers[r] = temp;
//        }
//        System.out.println(Arrays.toString(numbers));


        // Foreach Loop: Bir arrayde indexler sadece elemanlara ulaşmak için kullanılıyorsa foreach döngüsü yazmak kodu kısaltır
        // Array ve ArrayList'te kullanılır
        /* Yapısı
            for(elementType varName: arrayName / arrayListName) {
              statements
            }
         */
        // Örn; bir arrayın her elemanının karesini ekrana bastıran kod
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((int) (Math.pow(numbers[i], 2)) + " ");
        }
        System.out.println();
        // foreach
        for (int e :
                numbers) {
            System.out.print((int) Math.pow(e, 2) + " ");
        }
        System.out.println();
        String[] cities = {"Boston", "LA", "New York", "Atlanta"};
        for (String s :
                cities) {
            System.out.println(s);
        }



    }
}
