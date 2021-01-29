package com.tekwill.learning.trivia.gamearrayversion.domain;

import java.util.Random;

public class AskAuditoryHelpOption {
    private static boolean optionAvailable = true;

    public void invoke(Question question) throws InterruptedException {
        if (optionAvailable) {
            System.out.println("Auditory is voting . . .");
            Thread.sleep(3000);
            Random random = new Random();
            int votesForWrongAnswerOne = random.nextInt(25);
            int votesForWrongAnswerTwo = random.nextInt(25);
            int votesForWrongAnswerThree = random.nextInt(25);
            int votesForCorrectAnswer = 100 - votesForWrongAnswerOne - votesForWrongAnswerTwo - votesForWrongAnswerThree;
            int[] probabilities = new int[]{votesForWrongAnswerOne, votesForWrongAnswerTwo, votesForWrongAnswerThree};


            for (int i =0, j = 0; i < question.getAnswers().length; i++) {
                if (question.getAnswers()[i].isCorrect()) {
                    System.out.println(question.getAnswers()[i] + " " + votesForCorrectAnswer + "%");
                }
                else{
                    System.out.println(question.getAnswers()[i] + " " + probabilities[j] + "%");
                    j++;
                }
            }
            System.out.println();
            setOptionAvailable(false);
        }
        else System.out.println("Sorry!!! You have used this option already ");
    }

    public static boolean isOptionAvailable(){ return optionAvailable; }

    public void setOptionAvailable(boolean available){optionAvailable = available; }
}
