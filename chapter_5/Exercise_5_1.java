/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_1 {
    
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();
        System.out.println(dice);
        dice.roll();
        System.out.println(dice);
    }
}

class PairOfDice {
    
    /**
     * Values of two dice
     */
    private int die1, die2;
    
    /**
     * Creates an instance and fills dice with random values
     */
    public PairOfDice() {
        this(1, 1);
        roll();
    }
    
    /**
     * Creates an instance and fills dice with given values
     * @param die1 value of the first die
     * @param die2  value of the second die
     */
    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }
    
    /**
     * Returns the value of the first die
     * @return int - value of the first die
     */
    public int getDie1() {
        return die1;
    }
    
    /**
     * Returns the value of the second die
     * @return int - value of the second die
     */
    public int getDie2() {
        return die2;
    }
    
    /**
     * Rolls two dice
     */
    public final void roll() {
        die1 = rollOneDie();
        die2 = rollOneDie();
    }
    
    /**
     * Simulates rolling of a die
     * @return int - random value between 1 and 6
     */
    public int rollOneDie() {
        return (int)(6*Math.random())+1;
    }
    
    /**
     * Represents values of dice as a string value
     * @return String - values of dice
     */
    @Override
    public String toString() {
        return "Die1 = " + Integer.toString(die1) + ", Die2 = " +
                Integer.toString(die2);
    }
}
