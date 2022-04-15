package Ch9_ObjectsAndClasses.Ch9_7_Statics;

import Ch9_ObjectsAndClasses.Ch9_1_Intro.Circle;

public class Ch9_7_StaticVSInstance {
    public static void main(String[] args) {
        /*
            Static: class'ın kendisine aittir. Kullanmak için herhangi bir objeye ihtiyaç yoktur.
                class'ın bütün objeleri için ve diğer tüm classlar veya methodlar için ortaktır
                static bir değişkene veya methoda erişmek
                    ClassName.varName
                    ClassName.methodName()

            Instance (Nonstatic): Objenin kendisine aittir. Kullanmak için objeye ihtiyaç duyar
                sadece objenin kendisine özeldir
                instance bir değişkene veya methoda erişmek
                    objRefName.varName
                    objRefName.methodName()
         */

        /*
            Ne zaman static ne zaman non-static method?
                Bir method işini gerçekleştirmek için herhangi bir objeye ihtiyaç duyuyorsa
                non-static, duymuyorsa static method olmalı

         */

        // Static method örneği
        double r = Math.random();
        Math.abs(-5);

        // static variable örneği
        double pi = Math.PI;
        double e = Math.E;

//        Circle.calculateArea(); // non-static olduğu için bu şekilde erişilemez

        // Non-static method örneği
        Circle c = new Circle();
        c.calculateArea(); // non-static olduğu için obje oluşturarak kullanılmak zorundadır.

        // non-static variable örneği
        double radius = c.radius;
//        Circle.radius // non-static olduğu için böyle erişilemez

        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee e1 = new Employee("name-1", "surname-1" , 20, 1);
        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee e2 = new Employee("name-2", "surname-2" , 22, 3);
        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee e3 = new Employee("name-3", "surname-3" , 24, 5);
        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee e4 = new Employee("name-4", "surname-4" , 33, 10);
        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee e5 = new Employee("name-5", "surname-5" , 43, 15);
        System.out.println("number of employees: " + Employee.numberOfEmployees);

        Employee.printNumberOfEmployees();
        dummy();

        e1.introduce();
        e2.introduce();
        e3.introduce();

        System.out.println("\n\n");
        e5.introduce();
        Employee.introduce(e5);

        Employee.isSenior(e5);

        /*  Erişim sınırları
                instance method hem instance hem de static method/değişkene erişebilir
                static method sadece static method/değişkene erişebilir
         */

    }

    private static void dummy(){
        Employee.printNumberOfEmployees();
    }
}
