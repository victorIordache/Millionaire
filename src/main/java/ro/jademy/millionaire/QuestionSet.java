package ro.jademy.millionaire;

import java.util.ArrayList;

public class QuestionSet {

    public ArrayList<Question> questionList = new ArrayList<>();


    public QuestionSet() {}

    public QuestionSet(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }


    //Print questions from questionList

    public void printQuestionSet() {
        for(Question question : questionList){
                System.out.println(question.questionToAsk);
        }
    }

}