package com.tekwill.learning.trivia.gamearrayversion.repository;

import com.tekwill.learning.trivia.gamearrayversion.domain.Answer;
import com.tekwill.learning.trivia.gamearrayversion.domain.Question;
import com.tekwill.learning.trivia.domain.QuestionsRaw;

public class QuestionRepository {
    public static Question[] questions = new Question[]{

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1_SCORE, 1, com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_1_CORRECT_ANSWER_4, true, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2_SCORE, 1,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2_CORRECT_ANSWER_2, true, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_2_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3_SCORE, 1,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3_CORRECT_ANSWER_1, true, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_1_QUESTION_3_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1_SCORE, 2,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1_CORRECT_ANSWER_3, true, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_1_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2_SCORE, 2,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_2_CORRECT_ANSWER_4, true, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3_SCORE, 2,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3_CORRECT_ANSWER_2, true, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_2_QUESTION_3_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1_SCORE, 3,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1_CORRECT_ANSWER_1, true, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1_ANSWER_3, false, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_1_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2_SCORE, 3,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2_CORRECT_ANSWER_3, true, "C"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_2_ANSWER_4, false, "D")}),

        new Question(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_3_SCORE, 3,  com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_3,
            new Answer[] {
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_3_ANSWER_1, false, "A"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_3_ANSWER_2, false, "B"),
                    new Answer(com.tekwill.learning.trivia.domain.QuestionsRaw.LEVEL_3_QUESTION_3_ANSWER_3, false, "C"),
                    new Answer(QuestionsRaw.LEVEL_3_QUESTION_3_CORRECT_ANSWER_4, true, "D")})
    };


}
