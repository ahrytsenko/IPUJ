/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_2 {
    
    public static void main(String[] args) {
        
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        
        System.out.printf("The first die comes up %d\n", die1);
        System.out.printf("The second die comes up %d\n", die2);
        System.out.printf("Your total roll is %d\n", die1+die2);
        
    }
    
}
