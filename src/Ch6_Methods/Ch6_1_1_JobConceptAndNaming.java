package Ch6_Methods;

public class Ch6_1_1_JobConceptAndNaming {
    public static void main(String[] args) {
        /*
            Job concept = iş kavramı
            gerçek hayatta iş: ekmek almak, yemek yapmak, ders çalışmak vs birer iştir. Hareket içerir. Fiillerden oluşur
            İşler kodlama dünyasında fonksiyonlarla/methodlarla tanımlanır. İş varsa o işi yapan bir method kesin vardır
            Math.max -> max. eleman bulma işini yapar
            Math.round -> sayı yuvarlama işi
            System.out.println -> konsola bastırma işi

            Programlama yaparken bir işin yapılması gerekiyorsa ilk önce o işi yapabilen bir method var mı ona bakılır
            eğer yoksa method yazılır.

            Programlama birden fazla işin anlamlı bir şekilde peşpeşe çalışmasıyla yapılır.

            İşler alt işlerden oluşabilir. Her alt iş bir method yazılmasını gerektirir.

            Örn; evi temizlemek
            Asıl iş -> evi temizlemek
            Alt işler;
                evi temizlemek = mutfağı temizlemek + banyoyu temizlemek + evi süpürmek
                    mutfağı temizlemek = bulaşığı yıkamak + ocağı temizlemek
                        ocağı temizlemek = parçaları yıkamak + ocağı silmek
                    banyoyu temizlemek = yerleri yıkamak + klozeti yıkamak

               TO DO:
                    1. Mutfağı Temizle
                        1.1. Bulaşığı yıka
                        1.2. Ocağı yıka
                           1.2.1. Parçaları yıka
                           1.2.2. Ocağı sil
                    2. Banyoyu temizle
                        2.1. Yerleri yıka
                        2.2. Klozeti yıka
                    3. Evi süpür


            Programlama yaparken işleri nasıl anlarız?
                1- Sözel olarak ifade ettiğin şeyler fiil içeriyorsa bu bir iştir. Her fiil cümlesi bir fonksiyon yazmayı
                   gerektirmez. Bazen birden fazla fiil cümlesi bir işi tanımlar.
                2- Döngülerin kendisi bir iş yapar. Her döngü bir iştir
                3- Birden fazla method bir araya gelip iş oluşturabilir.
                    Örn; ocağı temizlemek = parçaları yıkamak + ocağı silmek
                    Örn; hw7 = rastgele array oluştur + en büyük elemanı bul
                    public static int hw7(){
                        int[] arr = createRandomArray();
                        int max = findMax(arr);
                        return max;
                    }
                4- Kod satırlara bakıldığında belirli satırlar kendi aralarında anlamsal bütünlük oluşturuyorsa bu satırlar
                    iş belirtir. Methoda çevrilebilir.



         */

        /*
            Method Naming: methodun ismi fiil olur ve yaptığı işi söyler
                Örn; eviTemizle(), yerleriYıka(), ocağıSil()
                Örn; findMax(), createRandomArray()
         */

        eviTemizle();


    }

    public static void eviTemizle() {
        mutfağıTemizle();
        banyoyuTemizle();
        eviSüpür();
    }

    public static void eviSüpür() {// alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama
    }

    public static void banyoyuTemizle() {
        yerleriYıka();
        klozetiYıka();
    }

    public static void klozetiYıka() { // alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama

    }

    public static void yerleriYıka() { // alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama

    }

    public static void mutfağıTemizle() {
        bulaşığıYıka();
        ocağıTemizle();
    }

    public static void ocağıTemizle() {
        parçalarıYıka();
        ocağıSil();
    }

    public static void ocağıSil() { // alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama
    }

    public static void parçalarıYıka() { // alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama
    }

    public static void bulaşığıYıka() { // alt işlerden oluşmaz, implementasyon içerir
        // değişkenler, if, else, döngü vs kodlama
    }
}
