import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Scanner;
/**
 * An object player that runs it's own Fire, Jump, and Run 'animation'
 * @author Mia Dia, Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
public class Player {
    /**
     * Default constructor
     */
    public Player () {
      System.out.println("Our hero is born");
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
                for (int i = 0; i < 3; i++) {
                    System.out.println(reader.nextLine());
                }
                    sleep(200);
                    clear();
            }
            reader.close();
            clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads text file named "run.txt", goes through lines in file,
     * and prints out every 3 lines of code before replacing the output
     * with the next 3 lines every second.
     */
    public void runForward () {
        try {
            clear();
            Scanner reader = new Scanner(new File("run.txt"));
            while (reader.hasNextLine()) {
                for (int i = 0; i < 3; i++) {
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

    //Writen By Portia Plante
    /**
     * Sleep / Pause the console for a certain number of miliseconds
     * @param num number of mili seconds to pause
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
    
     //Writen By Portia Plante
    /**
     * clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }

}
