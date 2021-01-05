package com.tekwill.learning.trivia;

import java.util.Scanner;
import com.tekwill.learning.trivia.Questions;

import static com.tekwill.learning.trivia.Questions.LEVEL_1_QUESTION_1;

public class Game {
    public static boolean running = true;
    public static boolean notStarted = true;
    //public static int numberOfQuestions = 9;
    public static int questionNumber = 1;
    public static int questionScore = 0;
    public static int totalScore = 0;
    public static char correctAnswer;

    public static void checkQuestion(int number) {
        switch (number) {
            case 1:
                System.out.println(Questions.LEVEL_1_QUESTION_1);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_4);
                correctAnswer = Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_1_SCORE;
                break;
            case 2:
                System.out.println(Questions.LEVEL_1_QUESTION_2);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                correctAnswer = Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_2_SCORE;
                break;
            case 3:
                System.out.println(Questions.LEVEL_1_QUESTION_3);
                System.out.println(Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_4);
                correctAnswer = Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_1.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_3_SCORE;
                break;
            case 4:
                System.out.println(Questions.LEVEL_2_QUESTION_1);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_4);
                correctAnswer = Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_3.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_1_SCORE;
                break;
            case 5:
                System.out.println(Questions.LEVEL_2_QUESTION_2);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_4);
                correctAnswer = Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_2_SCORE;
                break;
            case 6:
                System.out.println(Questions.LEVEL_2_QUESTION_3);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_4);
                correctAnswer = Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_2.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_3_SCORE;
                break;
            case 7:
                System.out.println(Questions.LEVEL_3_QUESTION_1);
                System.out.println(Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                correctAnswer = Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_1_SCORE;
                break;
            case 8:
                System.out.println(Questions.LEVEL_3_QUESTION_2);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_4);
                correctAnswer = Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_3.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_2_SCORE;
                break;
            case 9:
                System.out.println(Questions.LEVEL_3_QUESTION_3);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4);
                correctAnswer = Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_3_SCORE;
                running = false;
                break;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type [START] to Start the game or [EXIT] to Exit ");

        while (notStarted) {
            String startKey = scanner.next();
            if (startKey.equals("START")) {
                notStarted = false;
                System.out.println("Let's begin...\n Chose the correct answer by typing [1], [2], [3] or [4]\n");
                System.out.println("Here is the first question: ");

                while (running) {
                    checkQuestion(questionNumber);
                    questionNumber++;


                    System.out.print("Your answer is :");
                    char givenAnswer = scanner.next().charAt(0);

                    if (givenAnswer == correctAnswer) {
                        totalScore += questionScore;
                        System.out.println();
                        System.out.println("Y-o-o-h-o-o-o!!! that's the CORRECT answer!!!!    You just Scored " +
                                questionScore + " points, and Your Total Score is " + totalScore + " points");
                        System.out.println();

                    } else {
                        System.out.println();
                        System.out.println("A-A-A-W-W-W!!! that's an INCORRECT answer!!! Your Total Score remains " + totalScore + " points");
                        System.out.println();
                    }

                }

                System.out.println("     * * * GAME IS OVER * * * \n\n" +
                        "      * * * YOUR SCORE IS " + totalScore + " points!!! * * *");

            } else if (startKey.equals("EXIT")) {
                notStarted = false;
                System.out.println("Bye-Bye...");
            } else System.out.println("I didn't get that... try again [START] or [EXIT]");
        }

    }
}
