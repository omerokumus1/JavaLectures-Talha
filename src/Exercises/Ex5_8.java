package Exercises;

import java.util.Scanner;

public class Ex5_8 {
    public static void main(String[] args) {
        /*
        (Find the highest score) Write a program that prompts the user to enter the number
        of students and each student’s name and score, and finally displays the name
        of the student with the highest score.
         */
        /** TODO:
         *      1. Read number of students
         *      2. Read students names and scores
         *      3. Keep track of the max score and the student
         *          3.1. Read the current score and compare with max score. If current > max then update max score and studentName
         *          3.2. The first student automatically has the max score, so no comparison available. Automatically set
         *              max score to the current student's score
         *      4. Display student with max score
         *
         */

        Scanner input = new Scanner(System.in);
        // 1. Read number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(input.nextLine());


        String currentStudentName, studentNameWithMaxScore = "";
        int currentStudentScore, max = -1;

        // Solution 1
//        for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++) {
//            // 2. Read students names and scores
//            System.out.print("Enter student name: ");
//            currentStudentName = input.nextLine();
//            System.out.print("Enter score: ");
//            currentStudentScore = input.nextInt();
//            input.nextLine();
//            // 3.2. The first student automatically has the max score, so no comparison available. Automatically set
//            //      max score to the current student's score
//            if (studentNumber == 1) {
//                max = currentStudentScore;
//                studentNameWithMaxScore = currentStudentName;
//            }
//            // 3.1. Read the current score and compare with max score. If current > max then update max score and studentName
//            else {
//                if (currentStudentScore > max) {
//                    max = currentStudentScore;
//                    studentNameWithMaxScore = currentStudentName;
//                }
//            }
//        }
//        // 4. Display student with max score
//        System.out.println("Student with max score: " + studentNameWithMaxScore);
//        System.out.println("Max score: " + max);

        // Solution 2
        currentStudentName = "";
        studentNameWithMaxScore = "";
        currentStudentScore = 0;
        max = -1;
        // 3.2. The first student automatically has the max score, so no comparison available. Automatically set
        //      max score to the current student's score
//        System.out.print("Enter student name: ");
//        studentNameWithMaxScore = input.nextLine();
//        System.out.print("Enter score: ");
//        max = input.nextInt();
//        input.nextLine();
//        for (int studentNumber = 2; studentNumber <= numberOfStudents; studentNumber++) {
//            // 2. Read students names and scores
//            System.out.print("Enter student name: ");
//            currentStudentName = input.nextLine();
//            System.out.print("Enter score: ");
//            currentStudentScore = input.nextInt();
//            input.nextLine();
//            // 3.1. Read the current score and compare with max score. If current > max then update max score and studentName
//            if (currentStudentScore > max) {
//                max = currentStudentScore;
//                studentNameWithMaxScore = currentStudentName;
//            }
//        }
//        // 4. Display student with max score
//        System.out.println("Student with max score: " + studentNameWithMaxScore);
//        System.out.println("Max score: " + max);

        // Solution 3
        currentStudentName = "";
        currentStudentScore = 0;
        max = -1;
        studentNameWithMaxScore = "";
        for (int studentNumber = 0; studentNumber < numberOfStudents; studentNumber++) {
            // 2. Read students names and scores
            System.out.print("Enter student name: ");
            currentStudentName = input.nextLine();
            System.out.print("Enter score: ");
            currentStudentScore = input.nextInt();
            input.nextLine();
            if (currentStudentScore > max){
                max = currentStudentScore;
                studentNameWithMaxScore = currentStudentName;
            }
        }
        // 4. Display student with max score
        System.out.println("Student with max score: " + studentNameWithMaxScore);
        System.out.println("Max score: " + max);
    }
    // -100 1 2 56 4 8 7 4 5 2 3 6 5 8 9
}
