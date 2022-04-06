package Ch9_ObjectsAndClasses.Ch9_1_Intro;

import java.lang.module.ModuleFinder;

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
        System.out.println("circle4 radius: " + circle4.radius + ", lineColor: " + circle4.lineColor + ", lineWidth: " + circle4.lineWidth);

        circle4.introduce();
        System.out.println("circle4 area: " + circle4.calculateArea());
        System.out.println("circle4 perimeter: " + circle4.calculatePerimeter());
    }

    // tercih edilmez, class içerisinde yazmak daha iyi.
    double calculateArea(Circle circle){
        return Math.PI * circle.radius * circle.radius;
    }
}
