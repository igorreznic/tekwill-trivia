package com.tekwill.learning.trivia.gamearrayversion.domain;


public class AskAFriendHelpOption {

    private static boolean optionAvailable = true;

    public void invoke(Question question) throws InterruptedException {
        if(optionAvailable) {
            System.out.println("Calling Your Friend . . .");
            Thread.sleep(3000);

            System.out.println("Your Friend:     I think the correct answer is " + question.getCorrectAnswer());
            System.out.println();
            setOptionAvailable(false);
        }
        else System.out.println("Sorry!!! You have used this option already ");
    }

    public static boolean isOptionAvailable(){ return optionAvailable; }

    public void setOptionAvailable(boolean available){optionAvailable = available; }
}
