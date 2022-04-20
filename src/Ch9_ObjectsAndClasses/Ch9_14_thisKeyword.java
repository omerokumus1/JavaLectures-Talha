package Ch9_ObjectsAndClasses;

public class Ch9_14_thisKeyword {
    /*
        - this keyword'ü ile instance methodlara ve instance değişkenlere erişim sağlanır
        - shadowing'i engeller
        - this kelimesi üzerine çağırdığımız objenin referansına sahip olur.
        - shadowing olmadığı durumda otomatik olarak hangi obje üzerine çağırım yapılırsa o kullanılır.
            Örn; this.speak() = speak()
     */
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat-1", 1, "male");
        Cat cat2 = new Cat("cat-2", 2, "female");

        cat1.speak(); // this keyword'ü cat1'in referansına sahip olur, yani this ile cat1 üzerine işlem yapılabilir
//        System.out.println("cat-1 ref: " + cat1);
        cat2.speak(); // this keyword'ü cat2'nin referansına sahip olur, yani this ile cat2 üzerine işlem yapılabilir.
//        System.out.println("cat-2 ref: " + cat2);

        cat1.setAge(2);
        cat2.setAge(3);
    }
}

class Cat {
    private String name;
    private int age;
    private String gender;

    Cat(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void speak() {
        System.out.println("My name is " + this.name);
//        System.out.println("this ref: " + this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age; // shadowing olduğu için this kullanmak zorunludur
        // speak methodu için shadowing durumu olmadığından ötürü this.speak() ile speak() aynı obje için çalışır.
        // Örn; diyelimki cat1.setAge(3); çağırıldı. O zaman this.speak() ve speak() kodları cat1 üzerine çağırılır.
        this.speak();
        speak();
        // aşağıdaki kodlar için shadowing olmadığından dolayı this yapmak zorunlu değildir
        this.name = "cat-2-new";
        name = "cat-2-new";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
