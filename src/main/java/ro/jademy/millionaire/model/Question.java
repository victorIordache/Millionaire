package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question {

    private String questionToAsk;
    private int difficulty;
    private List<Answer> answerList= new ArrayList<>();


    public Question(){}

    public Question(String question, int difficulty, List<Answer> answerList){
        this.questionToAsk = question;
        this.difficulty = difficulty;
        this.answerList= answerList;
    }

    public String getQuestionToAsk() {
        return questionToAsk;
    }

    public void setQuestionToAsk(String questionToAsk) {
        this.questionToAsk = questionToAsk;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
/*
    checkAnswer steps:
        1. Create an Answer object to go through answerList
        2. Check if any of the question's answers are identical with Player's answer
        3. return true
            else
           return false;
     */

    public boolean checkAnswer(String answer){
        for(Answer answerCheck : answerList){
            if(answerCheck.getResponse() == answer){
                return true;
            }
        }
        return false;
    }

    /*
    validateQuestion steps:
        1.  Create an answer object to go through the ArrayList<Answer>
        2.  Check if your ArrayList<Answer> has at least 1 correct answer then your question is good to go
        3.  else
        4.  your question must be deleted ( destroy the reference to the object )
     */

    public boolean validateQuestion(Question question){
        for(Answer answer : answerList){
            if(answer.isCorrect()){
                return true;
            }
        }
        question = null;
        return false;
    }
}
