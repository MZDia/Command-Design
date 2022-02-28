/**
 * This class handles 
 * @author Mark Valentino, Samuel Godfrey
 */
public class QuitCommand implements Command {
    private Player player;
    /**
     * Constructor. Calls the execute() method.
     * @param player the player to be set
     */
    public QuitCommand (Player player) {
        this.player = player;
    }

    /**
     * Method to display a thank you message and terminate the program.
     */
    public void execute () {
        System.out.println("Thanks for Playing!");
    }
}
