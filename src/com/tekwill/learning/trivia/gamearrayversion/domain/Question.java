package com.tekwill.learning.trivia.gamearrayversion.domain;

import com.tekwill.learning.trivia.gamearrayversion.domain.Answer;
import com.tekwill.learning.trivia.gamearrayversion.repository.QuestionRepository;

import java.util.Arrays;

public class Question {
    private int score;
    private int level;
    private String questionText;
    private final Answer[] answers;

    public Question(int score, int level, String questionText, Answer[] answers ) {
        this.score = score;
        this.level = level;
        this.questionText = questionText;
        this.answers = answers;
    }

    public Answer[] getAnswers(){return answers;}

    public int getScore(){return score;}

    public Answer getCorrectAnswer(){
        for (Answer answer : answers) {
            if (answer.isCorrect()) {
                return answer;
            }
        }
        return null;
    }

    public Answer[] getWrongAnswers() {
        Answer[] wrongAnswers = new Answer[answers.length - 1];
        for (int i = 0, k = 0; i < answers.length; i++) {
            if (!answers[i].isCorrect()) {
                wrongAnswers[k++] = answers[i];
            }
        }
        return wrongAnswers;
    }

    @Override
    public String toString(){
        return "  Question:  " + questionText +
                "\n" +getAnswers()[0] + "\n" +
                getAnswers()[1] + "\n" +
                getAnswers()[2] + "\n" +
                getAnswers()[3];

    }
//Arrays.toString(answers)

}
