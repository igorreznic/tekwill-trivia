package com.tekwill.learning.trivia;

import java.util.Random;
import java.util.Scanner;
import com.tekwill.learning.trivia.Questions;

import static com.tekwill.learning.trivia.Questions.LEVEL_1_QUESTION_1;

public class Game {
    public static boolean running = true;
    public static boolean notStarted = true;
    public static boolean optionH1Available = true;
    public static boolean optionH2Available = true;
    public static boolean optionH3Available = true;

    public static String displayH1option = " [H1] - Call a Friend,";
    public static String displayH2option = " [H2] - Ask Auditory,";
    public static String displayH3option = " [H3] - 50/50";



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
                System.out.println("Let's begin...\n Chose the correct answer by typing [1], [2], [3], [4] or [H1], [H2], [H3] for HELP options.\n");
                System.out.println("Here is the first question: ");

                while (running) {
                    checkQuestion(questionNumber);
                    questionNumber++;

                        // Displaying HELP options
                    if (optionH1Available || optionH2Available || optionH3Available) {
                        System.out.println("\nYou have HELP options:" + displayH1option + displayH2option + displayH3option);
                    }
                    else{
                        System.out.println("\nYou have used all Your HELP options.");
                    }

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

                            if (givenAnswer.equals("H1") && optionH1Available) {
                                optionH1Available = false;
                                displayH1option = "";
                                System.out.println("Calling Your Friend . . .");
                                Thread.sleep(5000);
                                System.out.println("Your Friend:\n I think the correct answer is " + correctAnswer);
                                System.out.println();
                            }
                            else if (givenAnswer.equals("H2") && optionH2Available) {
                                optionH2Available = false;
                                displayH2option = "";
                                System.out.println("Auditory is voting . . .");
                                Thread.sleep(5000);
                                Random random = new Random();
                                int votesForAnIncorrectAnswer = random.nextInt(25);
                                int votesForOtherIncorrectAnswer = random.nextInt(25);
                                int votesForAnotherIncorrectAnswer = random.nextInt(25);
                                int votesForCorrectAnswer = 100 - votesForAnIncorrectAnswer - votesForOtherIncorrectAnswer - votesForAnotherIncorrectAnswer;

                                switch (correctAnswer) {
                                    case "1":
                                        System.out.println("1. " + votesForCorrectAnswer + "%");
                                        System.out.println("2. " + votesForAnIncorrectAnswer + "%");
                                        System.out.println("3. " + votesForOtherIncorrectAnswer + "%");
                                        System.out.println("4. " + votesForAnotherIncorrectAnswer + "%");
                                        break;
                                    case "2":
                                        System.out.println("1. " + votesForAnIncorrectAnswer + "%");
                                        System.out.println("2. " + votesForCorrectAnswer + "%");
                                        System.out.println("3. " + votesForOtherIncorrectAnswer + "%");
                                        System.out.println("4. " + votesForAnotherIncorrectAnswer + "%");
                                        break;
                                    case "3":
                                        System.out.println("1. " + votesForAnIncorrectAnswer + "%");
                                        System.out.println("2. " + votesForOtherIncorrectAnswer + "%");
                                        System.out.println("3. " + votesForCorrectAnswer + "%");
                                        System.out.println("4. " + votesForAnotherIncorrectAnswer + "%");
                                        break;
                                    case "4":
                                        System.out.println("1. " + votesForAnIncorrectAnswer + "%");
                                        System.out.println("2. " + votesForOtherIncorrectAnswer + "%");
                                        System.out.println("3. " + votesForAnotherIncorrectAnswer + "%");
                                        System.out.println("4. " + votesForCorrectAnswer + "%");
                                }


                            }
                            else if ((givenAnswer.equals("H3") && optionH3Available)) {
                                optionH3Available = false;
                                displayH3option = "";
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
                            else {
                                System.out.println("You have used this option already, and You can't use it for the second time");
                            }
                        }
                        else{
                            System.out.println("Pay attention to the keyboard!!!");
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
