/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
class Exercise_4_3 {

    public static void main(String[] args) {
        
        System.out.printf("It taken %d attempts to get 'Snake eyes'\n", rollDice(2));
        
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
