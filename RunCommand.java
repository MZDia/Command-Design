/**
 * Commands player character to run
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
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
     * Calls run method in class Player for object player.
     */
    public void execute () {
        this.player.runForward();
    }
}
