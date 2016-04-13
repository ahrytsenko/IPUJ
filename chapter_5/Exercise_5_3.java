/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agrytsenko
 */
public class Exercise_5_3 {
    
    public static final int MAX_ATTEMPTS = 10000;
    
    
    public static void main(String[] args) {
        
        Exercise_5_2[] calc = new Exercise_5_2[11];
        
        //for (int i = 0; i < 11)
        
        for (int i = 2; i < 13; i++) {
            calc[i-2] = new Exercise_5_2();
            for (int j = 0; j < MAX_ATTEMPTS; j++) {
                calc[i-2].enter(Exercise_4_4.rollDice(i));
            }
        }
        
        System.out.println("Total on Dice | AVG attempts | MAX attempts | STD Deviation");
        System.out.println("--------------|--------------|--------------|--------------");
        for (int i = 0; i < 11; i++) {
            System.out.printf("%8d      |%12.8f  |%12.8f  |%12.8f\n", i+2, calc[i].getMean(), calc[i].getMax(), calc[i].getStandardDeviation());
        }
    }
    
}
