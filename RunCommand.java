/**
 * Creates an instance of the Run Commands
 * @author Mia Dia(main) Samuel Godfrey(skeleton) 
 */

public class RunCommand implements Command {
    
    /**
     * Constructor, initializes declared player outside of class to player passed through parameter, then calls execute.
     * @param player
     */ 
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
