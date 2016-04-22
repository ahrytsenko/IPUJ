public class DiceExperiment extend Dice {
    
    private int attempts; 
    
    public DiceExperiment() { this(10, 2); } // DiceExperiment

    public DiceExperiment(int attempts) { this(attempts, 2); } // DiceExperiment
    
    public DiceExperiment(int appempts, int diceAmount) {
        super(diceAmount);
        this.attempts = attempts;
    }  // DiceExperiment

    public double takeExperiment(int desiredValue) {
        double average = 0;
        for (int j = 0; j < attempts; j++) {
            average += (double)rollDice(desiredValue) / attempts;
        }
        return average;
    } // takeExperiment

} // DiceExperiment
