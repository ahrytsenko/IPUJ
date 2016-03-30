import java.io.PrintStream;

/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_2_5 {
    
    public static void main(String[] args) {

        int grosses;
        int dozens;
        int eggs;
        
        System.out.print("Hi! Tell me how many eggs do you have: ");
        eggs = TextIO.getlnInt();
        
        grosses = (eggs / 144);
        eggs %= 144;
        
        dozens = (eggs / 12);
        eggs %= 12;

        System.out.printf("Grate! Your number of eggs is %d gross, %d dozen, and %d\n", grosses, dozens, eggs);
        
    }
}
