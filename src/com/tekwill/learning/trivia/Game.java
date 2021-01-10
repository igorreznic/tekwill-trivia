package com.tekwill.learning.trivia;

import java.util.Random;
import java.util.Scanner;
import com.tekwill.learning.trivia.Questions;

import static com.tekwill.learning.trivia.Questions.LEVEL_1_QUESTION_1;

public class Game {
    public static boolean running = true;
    public static boolean notStarted = true;
    public static boolean is_H1_Option = true;
    public static boolean is_H2_Option = true;
    public static boolean is_H3_Option = true;



    //public static int numberOfQuestions = 9;
    public static int questionNumber = 1;
    public static int questionScore = 0;
    public static int totalScore = 0;
    public static String correctAnswer;

    public static void checkQuestion(int number) {
        switch (number) {
            case 1:
                System.out.println(Questions.LEVEL_1_QUESTION_1);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_1_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_4);
                correctAnswer = "4";   //Questions.LEVEL_1_QUESTION_1_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_1_SCORE;
                break;
            case 2:
                System.out.println(Questions.LEVEL_1_QUESTION_2);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_2_ANSWER_4);
                correctAnswer = "2"; //Questions.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_2_SCORE;
                break;
            case 3:
                System.out.println(Questions.LEVEL_1_QUESTION_3);
                System.out.println(Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_1);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_2);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_1_QUESTION_3_ANSWER_4);
                correctAnswer = "1"; //Questions.LEVEL_1_QUESTION_3_CORRECT_ANSWER_1.charAt(0);
                questionScore = Questions.LEVEL_1_QUESTION_3_SCORE;
                break;
            case 4:
                System.out.println(Questions.LEVEL_2_QUESTION_1);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_1_ANSWER_4);
                correctAnswer = "3"; //Questions.LEVEL_2_QUESTION_1_CORRECT_ANSWER_3.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_1_SCORE;
                break;
            case 5:
                System.out.println(Questions.LEVEL_2_QUESTION_2);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_2_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_4);
                correctAnswer = "4"; //Questions.LEVEL_2_QUESTION_2_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_2_SCORE;
                break;
            case 6:
                System.out.println(Questions.LEVEL_2_QUESTION_3);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_1);
                System.out.println(Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_2);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_2_QUESTION_3_ANSWER_4);
                correctAnswer = "2"; //Questions.LEVEL_2_QUESTION_3_CORRECT_ANSWER_2.charAt(0);
                questionScore = Questions.LEVEL_2_QUESTION_3_SCORE;
                break;
            case 7:
                System.out.println(Questions.LEVEL_3_QUESTION_1);
                System.out.println(Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_1_ANSWER_4);
                correctAnswer = "1"; //Questions.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_1_SCORE;
                break;
            case 8:
                System.out.println(Questions.LEVEL_3_QUESTION_2);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_2_ANSWER_4);
                correctAnswer = "3"; //Questions.LEVEL_3_QUESTION_2_CORRECT_ANSWER_3.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_2_SCORE;
                break;
            case 9:
                System.out.println(Questions.LEVEL_3_QUESTION_3);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_1);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_2);
                System.out.println(Questions.LEVEL_3_QUESTION_3_ANSWER_3);
                System.out.println(Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4);
                correctAnswer = "4"; //Questions.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4.charAt(0);
                questionScore = Questions.LEVEL_3_QUESTION_3_SCORE;
                running = false;
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {

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

                    System.out.println("\nYou have HELP options: [H1] - Call a Friend, [H2] - Ask Auditory, [H3] - 50/50");

                    boolean answered = false;

                    while (!answered) {

                        System.out.print("Your answer is :");
                        String givenAnswer = scanner.next();

                        if (givenAnswer.equals(correctAnswer)) {
                            answered = true;
                            totalScore += questionScore;
                            System.out.println();
                            System.out.println("Y-o-o-h-o-o-o!!! that's the CORRECT answer!!!!    You just Scored " +
                                    questionScore + " points, and Your Total Score is " + totalScore + " points");
                            System.out.println();

                        } else if (givenAnswer.equals("1") || givenAnswer.equals("2") || givenAnswer.equals("3") || givenAnswer.equals("4")) {
                            answered = true;
                            System.out.println();
                            System.out.println("A-A-A-W-W-W!!! that's an INCORRECT answer!!! Your Total Score remains " + totalScore + " points");
                            System.out.println();
                        }

                        // Help Cycle

                        else if (givenAnswer.equals("H1") || givenAnswer.equals("H2") || givenAnswer.equals("H3")) {

                            if (givenAnswer.equals("H1")) {
                                is_H1_Option = false;
                                System.out.println("Calling Your Friend . . .");
                                Thread.sleep(5000);
                                System.out.println("Your Friend:\n I think the correct answer is " + correctAnswer);
                                System.out.println();
                            }
                            else if (givenAnswer.equals("H2")) {
                                is_H2_Option = false;
                                System.out.println("Auditory is voting . . .");
                                Thread.sleep(5000);
                                Random random = new Random();
                                int votesFor_A = random.nextInt(25);
                                int votesFor_B = random.nextInt(25);
                                int votesFor_C = random.nextInt(25);
                                int votesForCorrectAnswer = 100 - votesFor_A - votesFor_B - votesFor_C;

                                switch (correctAnswer) {
                                    case "1":
                                        System.out.println("1. " + votesForCorrectAnswer + "%");
                                        System.out.println("2. " + votesFor_A + "%");
                                        System.out.println("3. " + votesFor_B + "%");
                                        System.out.println("4. " + votesFor_C + "%");
                                        break;
                                    case "2":
                                        System.out.println("1. " + votesFor_A + "%");
                                        System.out.println("2. " + votesForCorrectAnswer + "%");
                                        System.out.println("3. " + votesFor_B + "%");
                                        System.out.println("4. " + votesFor_C + "%");
                                        break;
                                    case "3":
                                        System.out.println("1. " + votesFor_A + "%");
                                        System.out.println("2. " + votesFor_B + "%");
                                        System.out.println("3. " + votesForCorrectAnswer + "%");
                                        System.out.println("4. " + votesFor_C + "%");
                                        break;
                                    case "4":
                                        System.out.println("1. " + votesFor_A + "%");
                                        System.out.println("2. " + votesFor_B + "%");
                                        System.out.println("3. " + votesFor_C + "%");
                                        System.out.println("4. " + votesForCorrectAnswer + "%");
                                }


                            }
                            else {
                                is_H3_Option = false;
                                System.out.println("The computer removed two answers.\nChose from following two.");
                                Random random = new Random();

                                switch (correctAnswer) {
                                    case "1":
                                        System.out.println("1.");
                                        System.out.println((random.nextInt(3) + 2) + ". ");   //int randomNum =  random.nextInt(range) + minimum;
                                        break;
                                    case "2":
                                        System.out.println("2.");
                                        System.out.println((random.nextInt(2) + 3) + ". ");
                                        break;
                                    case "3":
                                        System.out.println((random.nextInt(2) + 1) + ". ");
                                        System.out.println("3.");
                                        break;
                                    case "4":
                                        System.out.println((random.nextInt(3) + 1) + ". ");
                                        System.out.println("4.");
                                }

                            }
                        }
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
