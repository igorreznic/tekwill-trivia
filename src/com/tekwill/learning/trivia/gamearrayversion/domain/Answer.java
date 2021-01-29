package com.tekwill.learning.trivia.gamearrayversion.domain;

public class Answer {
    private String answerText;
    private boolean isCorrect;
    private String answerLetter;

    public Answer(String answerText, boolean isCorrect, String answerLetter){
        this.answerText = answerText;
        this.isCorrect = isCorrect;
        this.answerLetter = answerLetter;
    }

    public String getAnswerText(){ return answerText;}
    public void setAnswerText(String text){this.answerText = text;}

    public boolean isCorrect(){ return isCorrect;}
    public void setCorrect(boolean correct){this.isCorrect = correct;}

    public String getAnswerLetter(){return answerLetter;}
    public void setAnswerLetter(String letter){this.answerLetter = letter; }

    @Override
    public String toString(){return answerLetter + ") " + answerText;}
}
