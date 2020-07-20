package ro.jademy.millionaire;

import java.util.ArrayList;

public class Question {

    public String questionToAsk;
    public int difficulty;
    private int prize;
    public ArrayList<Answer> answerList= new ArrayList<>();


    public Question(){}

    public Question(String question, int difficulty, int prize){
        this.questionToAsk = question;
        this.difficulty = difficulty;
        this.prize = prize;
    }

    //Add answers to your question!
    public void addAnswer(Answer answer){
        this.answerList.add(answer);
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
            if(answerCheck.response == answer){
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
            if(answer.isCorrect){
                return true;
            }
        }
        question = null;
        return false;
    }


    /*
    Remove 2 out of 4 answers in case players wants to use 50/50 help
    Steps:
        1. Create a variable to keep count of how many answers are elimated
        2. Create an Answer Object to go through the list
        3. if anwer is wrong remove it
            else
           just don't remove it lol.

     */

    public void eliminateTwoFalseAnswers(){
        int eliminatedAnswers=0;
        do{
            for(Answer answerCheck : answerList){
                if(answerCheck.isCorrect == false){
                    answerList.remove(answerCheck);
                    eliminatedAnswers++;
                }
            }
        }while(eliminatedAnswers<3);
    }

}
