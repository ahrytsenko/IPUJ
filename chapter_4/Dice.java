public class Dice extend Die {
    private int diceAmount;
    
    /**
     * Creates a set of diceAmount dice
     * @param diceAmount - int, amount of dice in a set
     */
    public Dice(int diceAmount) {
        super();
        if (diceAmount < 1) throw new IllegalArgumentException("Number of dice shoud be at least 1");
        this.diceAmount = diceAmount;
    }
    
    /**
     * rollDice simulates folling a set of dice until the total score is not equal to desiredValue
     * @param desiredValue - int, desired value of total score of a set of dice
     * @return - int, amount of attempts have been taken to get desiredValue
     * @trouw IllegalArgumentException - in case desiredValue is out of possible values
     */
    public int rollDice(int desiredValue) {
        
        if (desiredValue < diceAmount || desiredValue > diceAmount*6) throw new IllegalArgumentException();
        
        int attempts = 0;
        do {
            int value = 0;
            for (int i = 0; i < diceAmount; i++) value += rollDie();
            attempts++
        } while (value != desiredValue);
        
        return attempts;
    }

} // class Dice
