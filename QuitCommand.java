/**
 * 
 * @author Mark Valentino, Samuel Godfrey
 */
public class QuitCommand implements Command {
    /**
     * 
     * @param player
     */
    public QuitCommand (Player player) {
        this.player = player;
        exectute();
    }

    /**
     * Method to call the quit() method in the player class
     */
    public void execute () {
        System.out.println("Thanks for Playing!");
        System.exit(0);
    }
}
