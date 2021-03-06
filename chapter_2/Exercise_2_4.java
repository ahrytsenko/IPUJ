
import java.io.PrintStream;

/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */
 
 /*
 Exercise 2.4:
 Write a program that helps the user count his change. 
 The program should ask how many quarters the user has, then how many dimes, then how many nickels, 
 then how many pennies. Then the program should tell the user how much money he has, expressed in dollars.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_4 {
    
    public static void main(String[] args) {

        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        System.out.println("Hi! I can help you to count how much maney do you have. Tell me:");
        System.out.print(" - how many quarters do you have: ");
        quarters = TextIO.getlnInt();
        
        System.out.print(" - how many dimes do you have: ");
        dimes = TextIO.getlnInt();
        
        System.out.print(" - how many nickels do you have: ");
        nickels = TextIO.getlnInt();
        
        System.out.print(" - and how many pennies do you have: ");
        pennies = TextIO.getlnInt();
        
        System.out.printf("Grate! You have got %.2f dollar(s)\n", (quarters*0.25 + dimes*0.1 + nickels*0.05 + pennies*0.01));
        
    }
}
