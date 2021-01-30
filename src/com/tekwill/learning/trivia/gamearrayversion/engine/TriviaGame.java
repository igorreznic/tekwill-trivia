package com.tekwill.learning.trivia.gamearrayversion.engine;

import com.tekwill.learning.trivia.gamearrayversion.domain.AskAFriendHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.AskAuditoryHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.FiftyFiftyHelpOption;
import com.tekwill.learning.trivia.gamearrayversion.domain.Question;
import com.tekwill.learning.trivia.gamearrayversion.repository.QuestionRepository;

import java.util.Scanner;

public class TriviaGame {
    private static boolean started = false;
    private static boolean running = true;
    private static boolean answered;
    private static int currentScore;
    public static String displayH1option = " [H1] - Call a Friend,";
    public static String displayH2option = " [H2] - Ask Auditory,";
    public static String displayH3option = " [H3] - 50/50";

    public static void startGame() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type [START] to Start the game or [EXIT] to Exit ");

        while (!started) {
            String startKey = scanner.next();
            if (startKey.equalsIgnoreCase("START")) {
                started = true;
                System.out.println("Let's begin...\n");
                System.out.println("Here is the first question: \n");

                playGame();

            } else if (startKey.equalsIgnoreCase("EXIT")) {
                started = true;
                System.out.println("Bye-Bye...");
            } else System.out.println("I didn't get that... try again [START] or [EXIT]");
        }
    }

    private static void playGame() throws InterruptedException {
        while (running) {
            for (int i = 0; i< QuestionRepository.questions.length; i++) {
                displayQuestion(QuestionRepository.questions[i]);

                displayHelpOptions();

                answered = false;

                while (!answered) {

                    System.out.print("\n\nYour answer >>  >>");

                    //getResponse();
                    checkResponse(getResponse(), QuestionRepository.questions[i]);
                }
            }
            running = false;
        }

        System.out.println("     * * * GAME IS OVER * * * \n\n" +
                "      * * * YOUR SCORE IS " + currentScore + " points!!! * * *");

    }

    public static void displayQuestion(Question question){
        System.out.println(question.toString());
        System.out.println("\nChose the correct answer by typing [A], [B], [C], or [D]");
    }

    public static void displayHelpOptions(){
        if( AskAFriendHelpOption.isOptionAvailable() || AskAuditoryHelpOption.isOptionAvailable() || FiftyFiftyHelpOption.isOptionAvailable()){
            System.out.print("You have HELP options: ");
            if(AskAFriendHelpOption.isOptionAvailable()){
                System.out.print(displayH1option + " ");
            }
            if(AskAuditoryHelpOption.isOptionAvailable()){
                System.out.print(displayH2option + " ");
            }
            if(FiftyFiftyHelpOption.isOptionAvailable()){
                System.out.print(displayH3option);
            }
        }
        else{
            System.out.print("You don't have Help options available. You have used them all.");
        }
    }

    public static String getResponse(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void checkResponse(String response, Question question) throws InterruptedException {
        if(response.equalsIgnoreCase("a") || response.equalsIgnoreCase("b") ||response.equalsIgnoreCase("c") ||response.equalsIgnoreCase("d")){
            answered = true;
            if(question.getCorrectAnswer().getAnswerLetter().equalsIgnoreCase(response)){
                int questionScore = question.getScore();
                currentScore +=questionScore;
                System.out.println();
                System.out.println("Y-o-o-h-o-o-o!!! that's the CORRECT answer!!!!    You just Scored " +
                        questionScore + " points, and Your Total Score is " + currentScore + " points");
                System.out.println();
            }
            else {
                System.out.println();
                System.out.println("A-A-A-W-W-W!!! that's an INCORRECT answer!!! Your Total Score remains " + currentScore + " points");
                System.out.println();
            }

        }
        else if (response.equalsIgnoreCase("H1")){
            AskAFriendHelpOption.invoke(question);
        }
        else if (response.equalsIgnoreCase("H2")) {
            AskAuditoryHelpOption.invoke(question);
        }
        else if (response.equalsIgnoreCase("H3")) {
            FiftyFiftyHelpOption.invoke(question);
        }
        else System.out.println("Pay attention to the keyboard!!!");

    }

}
