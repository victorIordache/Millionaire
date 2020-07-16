package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static Scanner playerInput = new Scanner(System.in);


    public static void setGame(){
        QuestionSet questionSet = new QuestionSet();
        //Create Array answer for a question.
        ArrayList<Answer> answerQuestionEasy = new ArrayList<>();
        ArrayList<Answer> answerQuestionMedium = new ArrayList<>();
        ArrayList<Answer> answerQuestionHard = new ArrayList<>();
        ArrayList<Answer> answerQuestionVeryHard = new ArrayList<>();

        //Create Question and assign his Array of answers.
        Question questionEasy = new Question("2 + 2 equals?",answerQuestionEasy,1,1000);
        Question questionMedium = new Question("What what what what what",answerQuestionMedium, 2,10000);
        Question questionHard = new Question("ma doare in pula?",answerQuestionHard,3,100000);
        Question questionVeryHard = new Question("esti prost?",answerQuestionVeryHard,4,1000000);

        //Add answers to Array.
        questionEasy.answerList.add(new Answer("4",true));
        questionEasy.answerList.add(new Answer("28",false));
        questionEasy.answerList.add(new Answer("14",false));
        questionEasy.answerList.add(new Answer("Fish",false));

        questionMedium.answerList.add(new Answer("",false));
        questionMedium.answerList.add(new Answer("",false));
        questionMedium.answerList.add(new Answer("",false));
        questionMedium.answerList.add(new Answer("",false));



        //Validate Question/Answers, if no correct answer exist ==> Question == null.
        //TODO
        questionEasy.validateQuestion(questionEasy);

        questionSet.questionList.add(questionEasy);
        questionSet.questionList.add(questionMedium);
        questionSet.questionList.add(questionHard);
        questionSet.questionList.add(questionVeryHard);




        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$                                $");
        System.out.println("$           Welcome to:          $");
        System.out.println("$ Who wants to be a MILLIONAIRE! $");
        System.out.println("$                                $");

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$                                $");
        System.out.println("$ What is your name?             $");
        System.out.println("$                                $");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        String name = playerInput.nextLine();
        Player player1 = new Player(name);

        startGame(player1,questionSet);


    }
    //TODO MENU
    /*
    ASK FOR NAME
    INSERT NAME
        START GAME
    */
    public static void startGame(Player player, QuestionSet questionSet){
        System.out.println("Hello " +player.name+ ", are you ready?");
        for(int i = 0; i<4 ;i++) {
            Question questionCurrent = questionSet.questionList.get(i);
            System.out.println(questionCurrent.questionText);
        }
    }

    /*
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
