package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static Scanner playerInput = new Scanner(System.in);

    public static void setGame(){
        QuestionSet questionSet = new QuestionSet();
        //Create Array answer for a question.

        //Create Question and assign his Array of answers.
        Question questionEasy = new Question("2 + 2 equals?",1,1000);
        Question questionMedium = new Question("What's the capital of Romania?", 2,10000);
        Question questionHard = new Question("Which king was married to Eleanor of Aquitaine?",3,100000);
        Question questionVeryHard = new Question("Which county cricket side is based at Chester-le-Street?",4,1000000);

        //Add answers to Array.
        questionEasy.addAnswer(new Answer("4",true));
        questionEasy.addAnswer(new Answer("28",false));
        questionEasy.addAnswer(new Answer("14",false));
        questionEasy.addAnswer(new Answer("2",false));

        questionMedium.addAnswer(new Answer("London",false));
        questionMedium.addAnswer(new Answer("Washington",false));
        questionMedium.addAnswer(new Answer("Bucharest",false));
        questionMedium.addAnswer(new Answer("Budapest",false));

        questionHard.addAnswer(new Answer("Henry II", true));
        questionHard.addAnswer(new Answer("Henry V", false));
        questionHard.addAnswer(new Answer("Henry I", false));
        questionHard.addAnswer(new Answer("Richard I", false));

        questionVeryHard.addAnswer(new Answer("Warwickshire", false));
        questionVeryHard.addAnswer(new Answer("Durham", true));
        questionVeryHard.addAnswer(new Answer("Northants", false));
        questionVeryHard.addAnswer(new Answer("Leicestershire", false));

        //Validate Question/Answers, if no correct answer exist ==> Question == null.
        //TODO
        questionEasy.validateQuestion(questionEasy);
        questionMedium.validateQuestion(questionMedium);
        questionHard.validateQuestion(questionHard);
        questionVeryHard.validateQuestion(questionVeryHard);

        questionSet.questionList.add(questionEasy);
        questionSet.questionList.add(questionMedium);
        questionSet.questionList.add(questionHard);
        questionSet.questionList.add(questionVeryHard);

        System.out.println("            Welcome to:           ");
        System.out.println("  Who wants to be a MILLIONAIRE!  ");
        System.out.println("            What is your name?    ");

        String name = playerInput.nextLine();
        Player player = new Player(name);

        startGame(player,questionSet);
    }

    public static void startGame(Player player, QuestionSet questionSet){
        System.out.println(" Hello " +player.name+ ", are you ready? ");
        questionSet.printQuestionSet();
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
