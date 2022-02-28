import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Scanner;
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
        try {
            clear();
            Scanner reader = new Scanner(new File("jump.txt"));
            while (reader.hasNextLine()) {
                for (int i = 0; i < 6; i++) {
                    System.out.println(reader.nextLine());
                }
                    sleep(100);
                    clear();
            }
            reader.close();
            clear();
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
        try {
            clear();
            Scanner reader = new Scanner(new File("fire.txt"));
            while (reader.hasNextLine()) {
                for (int i = 0; i < 4; i++) {
                    System.out.println(reader.nextLine());
                }
                    sleep(100);
                    clear();
            }
            reader.close();
            clear();
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
