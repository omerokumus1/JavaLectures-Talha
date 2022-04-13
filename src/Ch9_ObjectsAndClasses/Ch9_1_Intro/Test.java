package Ch9_ObjectsAndClasses.Ch9_1_Intro;


public class Test {
    public static void main(String[] args) {
        // Object initialization -> obje oluşturma
        // ClassName varName = new ClassName();
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        // objenin property'lerine erişmek: varName.propertyName -> örn; circle1.radius
        System.out.println("circle1 radius: " + circle1.radius);
        System.out.println("circle2 radius: " + circle2.radius);

        // objenin property'lerini değiştirmek: varName.propertyName = newValue -> örn; circle1.radius = 9;
        circle1.radius = 9;
        System.out.println("circle1 radius: " + circle1.radius);

        // Hiçbir constructor yazılmamışsa aşağıdaki no-arg constructor otomatik olarak oluşturulur.
        // Eğer en az 1 tane elle yazılırsa, aşağıdaki constructor otomatik olarak oluşturulmaz.
        Circle circle3 = new Circle();
        System.out.println("circle3 radius: " + circle3.radius);


        // Birden fazla constructor kullanım örneği + Yeni property'lerin örneği
        Circle circle4 = new Circle(7, "Red", 2);
        System.out.println(circle4);
        System.out.println("circle4 radius: " + circle4.radius + ", lineColor: " + circle4.lineColor + ", lineWidth: " + circle4.lineWidth);

        circle4.introduce();
        System.out.println("circle4 area: " + circle4.calculateArea());
        System.out.println("circle4 perimeter: " + circle4.calculatePerimeter());

        // anonymous object: bir değişkene atanmayan objedir
        System.out.println("area of anonymous object: " + calculateArea(new Circle())); // new Circle() ile bir değişkene atanmadan
                                                                        // obje oluşturup methoda gönderdik. Bu objeye anonymous obje denir

        // null: bir referans değişkeni herhangi bir objeyi göstermiyorsa null değerine sahiptir
        Circle circle5 = null; // circle5 herhangi bir objeyi göstermez yani circle5 değişkeni ile bir objeye erişemeyiz
//        System.out.println(circle5.radius); // NullPointerException verir çünkü circle5 null'dur ve onunla erişilebilecek herhangi bir obje yoktur
    }

    // tercih edilmez, class içerisinde yazmak daha iyi.
    static double calculateArea(Circle circle){
        return Math.PI * circle.radius * circle.radius;
    }
}
