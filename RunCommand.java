/**
 * Creates an instance of the Run Commands
 * @author Mia Dia(main) Samuel Godfrey(skeleton) 
 */

public class RunCommand implements Command {
    private Player player;

    /**
     * Creates an instance of the Run Command
     * @param player of type player to use for the Run Command
     */
    public RunCommand (Player player) {
        this.player = player;
    }

    /**
     * Executes the player's run command
     */
    public void execute () {
        this.player.runForward();
    }
}
