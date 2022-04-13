package Ch9_ObjectsAndClasses;

import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Ch9_6_SomeJavaClasses {
    public static void main(String[] args) {
        // Date class
        Date date = new Date();
        System.out.println("date: " + date.toString());
        System.out.println("date.getTime(): " + date.getTime());
        Instant instant = date.toInstant();
        System.out.println("instant: " + instant.toString());

        Date date2 = new Date(16498535632L);
        System.out.println("date2: " + date2);
        System.out.println("date.before(date2): " + date.before(date2));
        System.out.println("date.getHours(): " + date.getHours());

        // Random class
        Random r = new Random();
        System.out.println("r.nextInt(): " + r.nextInt());
        System.out.println("r.nextInt(20): " + r.nextInt(20));
        System.out.println("r.nextDouble(): " + r.nextDouble());

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(20);
        }
        System.out.println("Random numbers without seed: ");
        System.out.println(Arrays.toString(numbers));

        r.setSeed(1L);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(20);
        }
        System.out.println("Random numbers with seed: ");
        System.out.println(Arrays.toString(numbers));

        // Point2D
        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        System.out.println("distance from 0,0 to 3,4: " + p1.distance(p2));
        System.out.println("distance from 0,0 to 5,12: " + p1.distance(5, 12));



    }
}
