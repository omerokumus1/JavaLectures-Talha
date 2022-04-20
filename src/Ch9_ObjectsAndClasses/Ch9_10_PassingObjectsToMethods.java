package Ch9_ObjectsAndClasses;

import Ch9_ObjectsAndClasses.Ch9_1_Intro.Circle;

public class Ch9_10_PassingObjectsToMethods {
    public static void main(String[] args) {
        /*
            - Objeler methodlara pass-by-reference ile gönderilir. Bu sebeple methoddaki değişiklik her yere yansır
            - method parametresi ClassName varName olarak tanımlanır
                    private static void dummy(Circle circle)
         */
        Circle circle = new Circle();
        int radius = 7;
        changeRadius(circle, radius);
        System.out.println(circle);
        System.out.println("Circle radius in main after changeRadius: " + circle.radius);
    }

    private static void changeRadius(Circle circle, int radius) {
        System.out.println(circle);
        circle.radius = radius;
        System.out.println("Circle radius in changeRadius method: " + circle.radius);
    }
}
