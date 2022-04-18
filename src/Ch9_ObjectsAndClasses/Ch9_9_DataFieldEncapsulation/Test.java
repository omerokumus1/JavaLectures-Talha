package Ch9_ObjectsAndClasses.Ch9_9_DataFieldEncapsulation;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3);
        triangle.a = -4;
        System.out.println("side a: " + triangle.a);

        triangle.setB(0);
        System.out.println("side b: " + triangle.getB());
    }
}
