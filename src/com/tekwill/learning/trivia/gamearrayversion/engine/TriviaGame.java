package com.tekwill.learning.trivia.gamearrayversion.engine;

import com.tekwill.learning.trivia.gamearrayversion.domain.AskAFriendHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.AskAuditoryHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.FiftyFiftyHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.Question;
import com.tekwill.learning.trivia.gamearrayversion.repository.QuestionRepository;

import java.util.Scanner;

public class TriviaGame {
    private static boolean Started = false;
    private static boolean running = true;
    public static String displayH1option = " [H1] - Call a Friend,";
    public static String displayH2option = " [H2] - Ask Auditory,";
    public static String displayH3option = " [H3] - 50/50";

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type [START] to Start the game or [EXIT] to Exit ");

        while (!Started) {
            String startKey = scanner.next();
            if (startKey.equalsIgnoreCase("START")) {
                Started = true;
                System.out.println("Let's begin...\n Chose the correct answer by typing [1], [2], [3], [4] or [H1], [H2], [H3] for HELP options.\n");
                System.out.println("Here is the first question: ");

                playGame();

            } else if (startKey.equalsIgnoreCase("EXIT")) {
                Started = true;
                System.out.println("Bye-Bye...");
            } else System.out.println("I didn't get that... try again [START] or [EXIT]");
        }
    }

    private static void playGame(){
        while (running) {
            for (int i = 0; i< QuestionRepository.questions.length; i++) {
                displayQuestion(QuestionRepository.questions[i]);

                displayHelpOptions();


                boolean answered = false;

                while (!answered) {

                    System.out.print("Your answer >>  >>");

                    // checkAnswer()

                }
            }
        }

//        System.out.println("     * * * GAME IS OVER * * * \n\n" +
//                "      * * * YOUR SCORE IS " + totalScore + " points!!! * * *");

    }

    public static void displayQuestion(Question question){
        System.out.println(question.toString());
    }

    public static void displayHelpOptions(){
        if( AskAFriendHelpOption.isOptionAvailable() || AskAuditoryHelpOption.isOptionAvailable() || FiftyFiftyHelpOption.isOptionAvailable()){
            System.out.print("You have HELP options: ");
            if(AskAFriendHelpOption.isOptionAvailable()){
                System.out.println(displayH1option + ", ");
            }
            if(AskAuditoryHelpOption.isOptionAvailable()){
                System.out.println(displayH2option + ", ");
            }
            if(FiftyFiftyHelpOption.isOptionAvailable()){
                System.out.println(displayH3option);
            }
        }
        else{
            System.out.println("You don't have Help options available. You have used them all.");
        }

    }

}
