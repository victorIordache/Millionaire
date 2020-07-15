package ro.jademy.millionaire;

import java.util.ArrayList;

public class Game {
    public static void setGame(){
        QuestionSet easyQuestionsSet = new QuestionSet();
        //Create Array answer for a question.
        ArrayList<Answer> answerQuestionEasy = new ArrayList<>();

        //Create Question and assign his Array of answers.
        Question questionEasy = new Question("2 + 2 equals?",answerQuestionEasy);

        //Add answers to Array.
        questionEasy.answerList.add(new Answer("4",true));
        questionEasy.answerList.add(new Answer("28",false));
        questionEasy.answerList.add(new Answer("14",false));
        questionEasy.answerList.add(new Answer("Fish",false));


        //Validate Question/Answers, if no correct answer exist ==> Question == null.
        //TODO
        questionEasy.validateQuestion(questionEasy);

        easyQuestionsSet.questionList.add(questionEasy);
    }
    //TODO MENU
    /*
    ASK FOR NAME
    INSERT NAME
        START GAME
            TODO START_GAME

                O CHOOSE 1 QUESTIONSET
                A DISPLAY 1 QUESTION AT A TIME

                  SWITCH
                    1A ANSWER1
                    1B ANSWER2
                    1C ANSWER3
                    1D ANSWER4
                  CHECK IF PLAYER CAN USE ONE OF THESE AND DISPLAY ONLY WHAT HE CAN USE:
                  HE MUST TYPE WHAT KIND OF HELP HE WANTS TO USE:
                    2  HELPFIFTY
                    2A HELPSWITCH
                    2B HELPJUMP

                  IF ANSWER ISRIGHT ADD PRIZE TO MONEY PLAYER AND GO TO A ELSE GO TO B
                B SWITCH
                    3A RESTART (GO TO O)
                    3B QUIT.
     */
}
