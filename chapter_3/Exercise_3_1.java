/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /*
Exercise 3.1:

How many times do you have to roll a pair of dice before they come up snake eyes? 
You could do the experiment by rolling the dice by hand. Write a computer program that simulates the experiment. 
The program should report the number of rolls that it makes before the dice come up snake eyes. 
(Note: "Snake eyes" means that both dice show a value of 1.) 
Exercise 2.2 explained how to simulate rolling a pair of dice.
*/

/**
 *
 * @author ahrytsenko
 */
public class Exercise_3_1 {
    
    public static void main(String[] args) {
        
        int count = 0;
        
        while (((int)(Math.random()*6) + 1) != 1 || (((int)(Math.random()*6) + 1) != 1)) {
            count++;
        }
        
        System.out.printf("Now \"Snake eyes\" appear after %d appempts\n", count);

    }
    
}
