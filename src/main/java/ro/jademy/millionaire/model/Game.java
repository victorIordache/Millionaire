package ro.jademy.millionaire.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    // 15 levels
    // 4 break points
    //      -> level [1, 5]    -> difficulty 0
    //      -> level [6, 10]   -> difficulty 1
    //      -> level [11, 14]  -> difficulty 2
    //      -> level 15        -> difficulty 3

    private static final List<Level> LEVELS = Arrays.asList(
            new Level(1, 0, 100, 0),
            new Level(2, 0, 200, 0),
            new Level(3, 0, 300, 0),
            new Level(4, 0, 500, 0),
            new Level(5, 0, 1000, 1000),
            new Level(6, 1, 2000, 1000),
            new Level(7, 1, 4000, 1000),
            new Level(8, 1, 8000, 1000),
            new Level(9, 1, 16000, 1000),
            new Level(10, 1, 32000, 1000),
            new Level(11, 2, 64000, 32000),
            new Level(12, 2, 125000, 32000),
            new Level(13, 2, 250000, 32000),
            new Level(14, 2, 500000, 32000),
            new Level(15, 3, 1000000, 500000)
    );

    private List<Question> difficultyZeroQuestions = new ArrayList<>();
    private List<Question> difficultyOneQuestions = new ArrayList<>();
    private List<Question> difficultyTwoQuestions = new ArrayList<>();
    private List<Question> difficultyThreeQuestions = new ArrayList<>();

    private List<Lifeline> lifeLines = new ArrayList<>();

    private Level currentLevel = LEVELS.get(0);

    public Game(List<Question> difficultyZeroQuestions, List<Question> difficultyOneQuestions, List<Question> difficultyTwoQuestions, List<Question> difficultyThreeQuestions, List<Lifeline> lifeLines) {
        this.difficultyZeroQuestions = difficultyZeroQuestions;
        this.difficultyOneQuestions = difficultyOneQuestions;
        this.difficultyTwoQuestions = difficultyTwoQuestions;
        this.difficultyThreeQuestions = difficultyThreeQuestions;
        this.lifeLines = lifeLines;
    }

    Scanner scanner = new Scanner(System.in);
    String option = "";


    public void startGame() {
        welcome();

        System.out.println("Choose A to show the rules.");
        System.out.println("Choose B to start the game.");
        System.out.println("Choose N to abort the game.");
        option = scanner.nextLine();

        switch (option) {
            case "A":
                showRules();
                break;

            case "Y":
                startGame();
                break;

            case "B":
                startGame();
                break;

            case "N":
                exitGame();
                break;

            default:
                System.out.println("You have to asnwer within the option above!");
                break;
        }
    }


    public void welcome() {
        String username;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$ Welcome to Who Wants to be a Millionaire! $");
        System.out.println("$              What's your name ?           $");
        username = scanner.nextLine();
        System.out.println("$  Welcome,   " + username + " ! $");


    }

    public void showRules() {
        System.out.println("RULES: \n 1.50-50 eliminates two wrong answers \n 2.You have only 1 life! \n 3.H is for HELP, it will remove 2 wrong answers");
    }

    public void exitGame() {
        System.out.println("You have exit the game");
        System.exit(0);
    }
}
