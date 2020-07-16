package ro.jademy.millionaire;

import java.util.ArrayList;

public class Question {
    public String questionText;
    public int difficulty;
    private int prize;
    public ArrayList<Answer> answerList= new ArrayList<>();


    public Question(){}

    public Question(String question ,ArrayList<Answer> answerList, int difficulty, int prize){
        this.answerList = answerList;
        this.questionText = question;
        this.difficulty = difficulty;
        this.prize = prize;
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
            if(answer.isCorrect){
                System.out.println("The question has a correct answer");
                return true;
            }
        }
        System.out.println("Please insert a correct answer for this question");
        question = null;
        return false;
    }

}
