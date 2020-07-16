package ro.jademy.millionaire;

public class Player {
    public String name;
    public int moneyEarned = 0;
    public boolean isHelpFiftyUsed = false;
    public boolean isHelpJumpUsed = false;
    public boolean isHelpSwitchUsed = false;

    public Player(String name) {
        this.name = name;
    }
}
