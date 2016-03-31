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
        
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        
        System.out.printf("The first die comes up %d\n", die1);
        System.out.printf("The second die comes up %d\n", die2);
        System.out.printf("Your total roll is %d\n", die1+die2);
        
    }
    
}
