import java.util.concurrent.TimeUnit;
import java.io.*;
/**
 * 
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
public class Player {
    /**
     * Default constructor
     */
    public Player () {
      System.out.println("Our hero is born");
    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }

    /**
     * Reads text file named "jump.txt", goes through lines in file,
     * and prints out every 6 lines of code before replacing the output
     * with the next 6 lines every second.
     */
    public void jump () {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("jump.txt"));
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                if (i == 6) {
                    sleep(100);
                    clear();
                    i = 1;  // resets i to 1 if 6 lines have been output already
                } else {
                    System.out.println(line);
                    i++;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads text file named "fire.txt", goes through lines in file,
     * and prints out every 3 lines of code before replacing the output
     * with the next 3 lines every second.
     */
    public void fire () {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("fire.txt"));
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                if (i == 3) {
                    sleep(100);
                    clear();
                    i = 1;  // resets i to 1 if 3 lines have been output already
                } else {
                    System.out.println(line);
                    i++;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     */
    public void runForward () {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("run.txt"));
            String line;
            int i = 1;
            while ((line = reader.readLine()) != null) {
                if (i == 3) {
                    sleep(100);
                    clear();
                    i = 1;  // resets i to 1 if 3 lines have been output already
                } else {
                    System.out.println(line);
                    i++;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
