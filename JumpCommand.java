/**
 * Commands player character to jump
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
public class JumpCommand implements Command {
    /**
     * Declaration of player to be used within this class
     */
    private Player player;

    /**
     * Constructor, initializes declared player outside of class
     * to player passed through parameter, then calls execute.
     * @param player
     */
    public JumpCommand (Player player) {
        this.player = player;
    }

    /**
     * Calls jump method in class Player for object player.
     */
    public void execute () {
        player.jump();
    }
}
