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

    /**
     * Reads text file named "jump.txt", goes through lines in file,
     * and prints out every 6 lines of code before replacing the output
     * with the next 6 lines every second.
     */
    public void jump () {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("jump.txt"));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                if (i == 6) {
                    i = 0;  // resets i to 0 if 6 lines have been output already
                    try {
                        Thread.sleep(1000);  // program sleeps for one second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[2J");  // ANSI code to clear screen
                    System.out.flush(); // flushes out remaining bytes
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
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                if (i == 3) {
                    i = 0;  // resets i to 0 if 3 lines have been output already
                    try {
                        Thread.sleep(1000);  // program sleeps for one second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[2J");  // ANSI code to clear screen
                    System.out.flush();  // flushes out remaining bytes
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
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                if (i == 3) {
                    i = 0;  // resets i to 0 if 3 lines have been output already
                    try {
                        Thread.sleep(1000);  // program sleeps for one second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[2J");  // ANSI code to clear screen
                    System.out.flush();  // flushes out remaining bytes
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
