package com.tekwill.learning.trivia.gamearrayversion.domain;

import java.util.Random;

public class FiftyFiftyHelpOption {
    private static boolean optionAvailable = true;

    public void invoke(Question question) throws InterruptedException {
        if(optionAvailable) {
            System.out.println("\"The computer is removing two answers . . .");
            Thread.sleep(3000);
            Random random = new Random();

                if (question.getAnswers()[0].isCorrect() || question.getAnswers()[1].isCorrect()) {
                    System.out.println(question.getCorrectAnswer());
                    System.out.println(question.getWrongAnswers()[random.nextInt(2)+3]);

                }
                else{
                    System.out.println(question.getCorrectAnswer());
                    System.out.println(question.getWrongAnswers()[random.nextInt(2)+1]);
                }

            System.out.println();
            setOptionAvailable(false);
        }
        else System.out.println("Sorry!!! You have used this option already ");
    }

    public static boolean isOptionAvailable(){ return optionAvailable; }

    public void setOptionAvailable(boolean available){optionAvailable = available; }


}
