package CaseStudies;

import java.util.Scanner;

public class CS_5_2_3_MultipleSubtractionQuiz {
    public static void main(String[] args) {
        int QUESTION_NUMBERS = 10;
        int correctAnswers = 0;
        int n1, n2, answer, result;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            n1 = (int) (Math.random()*10);
            n2 = (int) (Math.random()*10);
            result = n1-n2;
            System.out.printf("%d - %d = ?", n1, n2);
            answer = input.nextInt(); input.nextLine();
            if (answer == result){
                System.out.println("Correct!");
                correctAnswers++;
            }
            else{
                System.out.println("Wrong! The result was " + result);
            }
        }
        System.out.println("The number of correct answers: " + correctAnswers);

    }
}
