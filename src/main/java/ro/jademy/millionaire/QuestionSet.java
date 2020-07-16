package ro.jademy.millionaire;

import java.util.ArrayList;

public class QuestionSet {
    public ArrayList<Question> questionList = new ArrayList<>();

    public QuestionSet() {
    }

    public QuestionSet(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public void printQuestionEasy() {
        for(Question question : questionList){
            if(question.difficulty == 1){
                System.out.println(question.questionText);
            }
        }
    }
    public void printQuestionMedium() {
        for(Question question : questionList){
            if(question.difficulty == 2){
                System.out.println(question.questionText);
            }
        }
    }
    public void printQuestionHard() {
        for(Question question : questionList){
            if(question.difficulty == 3){
                System.out.println(question.questionText);
            }
        }
    }
    public void printQuestionVeryHard() {
        for(Question question : questionList){
            if(question.difficulty == 4){
                System.out.println(question.questionText);
            }
        }
    }
}