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
            System.out.printf("%8d %22.4f\n", i, de.takeExperiment(i));
    }

}

