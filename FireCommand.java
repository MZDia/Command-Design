/**
 * 
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
public class FireCommand implements Command {
   /**
    * 
    */ 
    private Player player;
    /**
     * 
     * @param player
     */
    public FireCommand (Player player) {
       this.player = player;
       execute();
    }

    /**
     * 
     */
    public void execute () {
        player.fire();
    }
}
