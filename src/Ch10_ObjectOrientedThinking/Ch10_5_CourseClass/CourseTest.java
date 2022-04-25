package Ch10_ObjectOrientedThinking.Ch10_5_CourseClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseTest {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        System.out.print("Number of students in course2: "
                + course2.getNumberOfStudents());
        System.out.println();

        course1.dropStudent("Peter");
        System.out.println("Number of students in course1 after wrong drop: " + course1.getNumberOfStudents());
        course1.dropStudent("Peter Jones");
        System.out.println("Number of students in course1 after successful drop: " + course1.getNumberOfStudents());
        System.out.println("course1 students:\n" + Arrays.toString(course1.getStudents()));

        course1.addStudent("Steve Rogers");
        System.out.println("course1 students:\n" + Arrays.toString(course1.getStudents()));

    }
}
