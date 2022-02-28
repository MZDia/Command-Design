import java.util.HashMap;
/**
 * Handles input from user and calls a player's method based on input
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();
    
    /**
     * Makes a new instance of the inputHandler and populates the hashmap with commands
     * @param player of type player to run commands
     */
    public InputHandler(Player player) {
        this.commands.put("jump", new JumpCommand(player));
        this.commands.put("fire", new FireCommand(player));
        this.commands.put("run", new RunCommand(player));
        this.commands.put("quit", new QuitCommand(player));
    }

    /**
     * Calls the associated command based on the input
     * @param button of type String that represents the command; either "jump", "run", "fire", or "quit"
     */
    public void buttonPressed(String button) {
        button = button.toLowerCase();
        if(button.equals("jump") || button.equals("run") || button.equals("fire") || button.equals("quit")) {
            this.commands.get(button).execute();
            return;
        }
        System.out.println("Invalid Input");
    }
}
