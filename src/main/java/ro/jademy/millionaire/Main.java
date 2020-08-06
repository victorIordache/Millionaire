package ro.jademy.millionaire;

import ro.jademy.millionaire.model.Answer;
import ro.jademy.millionaire.model.Game;
import ro.jademy.millionaire.model.Lifeline;
import ro.jademy.millionaire.model.Question;
import ro.jademy.millionaire.data.dataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Question> difficultyZeroQuestions = getRandomQuestions(5, 0);
        List<Question> difficultyOneQuestions = getRandomQuestions(5, 1);
        List<Question> difficultyTwoQuestions = getRandomQuestions(4, 2);
        List<Question> difficultyThreeQuestions = getRandomQuestions(1, 3);

        Game game = new Game(difficultyZeroQuestions,difficultyOneQuestions,difficultyTwoQuestions,difficultyThreeQuestions);

        // start the game

        game.startGame();

    }
    public static ArrayList<Answer> addAnswer(){
        ArrayList<Answer> answerList = new ArrayList<>();
        Answer answer1 = new Answer("One", false);
        Answer answer2 = new Answer("tw", false);
        Answer answer3 = new Answer("thre", false);
        Answer answer4 = new Answer("f4", true);
        answerList.add(new Answer("One", false));
        answerList.add(answer2);
        answerList.add(answer3);
        answerList.add(answer4);
        return answerList;
    }

    private static List<Question> getRandomQuestions(int nrOfQuestions, int difficulty){
        // loop through all questions
        // get all questions of given difficulty
        // loop through sub-list until nrOfQuestions and select random items by index
        // return said list

        List<Question> questionsOfDiff = new ArrayList<>();
        List<Question> questionRandom = new ArrayList<>();

        for(Question question : dataProvider.ALL_QUESTIONS){
            if(question.getDifficulty() == difficulty){
                questionsOfDiff.add(question);
            }
        }
        Random random = new Random();
        for(int i =0;i<nrOfQuestions;i++){
            int randomIndex = random.nextInt(questionsOfDiff.size());
            questionRandom.add(questionsOfDiff.remove(randomIndex));
        }
        return questionRandom;
    }













      /*
    public static void setGame(){
        System.out.println("            Welcome to:           ");
        System.out.println("  Who wants to be a MILLIONAIRE!  ");
        System.out.println("            What is your name?    ");
        String name = playerInput.nextLine();
    }

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
