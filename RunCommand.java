/**
<<<<<<< HEAD
 * Commands player character to run
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
=======
 * Creates an instance of the Run Commands
 * @author Mia Dia(main) Samuel Godfrey(skeleton) 
>>>>>>> 8b983ce2f2e0e019c057e3fd5beaf6ec22a6ebb9
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
<<<<<<< HEAD
     * Calls run method in class Player for object player.
=======
     * Executes the player's run command
>>>>>>> 8b983ce2f2e0e019c057e3fd5beaf6ec22a6ebb9
     */
    public void execute () {
        this.player.runForward();
    }
}
