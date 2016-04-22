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

        DiceExperiment de = new DiceExperiment(MAX_ATTEMPTS);
        
        System.out.println("Total On Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i <= 12; i++) 
            System.out.printf("%8d %22.4f\n", i, takeExperiment(MAX_ATTEMPTS, i));
    }

    
}

public class DiceExperiment extend Dice {
    
    private int attempts; 

    public DiceExperiment() { this(10, 2); }
    
    public DiceExperiment(int appempts, int diceAmount)

    public double takeExperiment(int attempts, int desiredValue) {
        double average = 0;
        for (int j = 0; j < attempts; j++) {
            average += (double)rollDice(desiredValue) / attempts;
        }
        return average;
    }

    
}
