class Exercise_4_3 {

    public static void main(String[] args) {
        
        System.out.printf("It taken %d attempts to get 'Snake eyes'", rollDice(2));
        
    }
    
    public static int rollDice(int desiredValue) {
        
        if (desiredValue < 2 || desiredValue > 12) throw exception new IllegalArgumentException;
        
        int attempts = 1;
        while ((rollDie() + rollDie()) != desiredValue) attempts++;
        return attempts;
    }
    
    /**
     * rollDie() simulates rolling of one die.
     * Returned
     * @return int - a value of rolled die
    public static int rollDie() {
        return (int)(Math.random()*6) + 1;
    }
}
