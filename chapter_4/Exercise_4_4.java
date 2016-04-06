/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_4_4 {
    public static final int MAX_ATTEMPTS = 10000;
    
    public static void main(String[] args) {
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i <= 12; i++) 
            System.out.printf("%8d %22.4f\n", i, takeExperiment(MAX_ATTEMPTS, i));
    }
    
    public static double takeExperiment(int attempts, int desiredValue) {
        double average = 0;
        for (int j = 0; j < attempts; j++) {
            average += rollDice(desiredValue) / (attempts * 1.0);
        }
        return average;
    }
    
    public static int rollDice(int desiredValue) {
        
        if (desiredValue < 2 || desiredValue > 12) throw new IllegalArgumentException();
        
        int attempts = 1;
        while ((rollDie() + rollDie()) != desiredValue) attempts++;
        return attempts;
    }
    
    /**
     * rollDie() simulates rolling of one die.
     * Returned
     * @return int - a value of rolled die
     */
    public static int rollDie() {
        return (int)(Math.random()*6) + 1;
    }    
}
