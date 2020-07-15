package ro.jademy.millionaire;

import java.util.ArrayList;

public class Question {

    public ArrayList<Answer> answerList= new ArrayList<>();

    public Question(ArrayList<Answer> answerList){
        this.answerList = answerList;
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
            if(answer.isCorrect == true){
                return true;
            }
        }
        question = null;
        return false;
    }

}
